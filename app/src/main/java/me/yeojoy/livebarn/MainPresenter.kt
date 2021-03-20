package me.yeojoy.livebarn

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.*
import me.yeojoy.livebarn.model.LbSurface
import me.yeojoy.livebarn.network.DataRepository
import me.yeojoy.livebarn.util.Sorter
import java.lang.reflect.Type

class MainPresenter(private val view: MainContact.View) : MainContact.Presenter {

    companion object {
        private val TAG = MainPresenter::class.simpleName
    }

    private val parentJob = Job()
    private val coroutineExceptionHandler: CoroutineExceptionHandler
            = CoroutineExceptionHandler { _, throwable ->
        coroutineScope.launch(Dispatchers.Main) {
            view.onLoadSurfaces(null)
        }

        GlobalScope.launch { println("Caught $throwable") }
    }

    private val coroutineScope = CoroutineScope(
        Dispatchers.Main + parentJob
                + coroutineExceptionHandler
    )

    override fun loadSurfaces() {
        coroutineScope.launch(Dispatchers.Main) {

            val rawData = getData()

            val sorter = Sorter()
            val sortedData = sorter.sortByTwoFactor(rawData)

            val dataMap = divideData(sortedData)
            view.onLoadSurfaces(dataMap)
        }
    }

    override fun onViewCreated() {

    }

    override fun onViewDestroyed() {
        coroutineScope.cancel()
    }

    private fun divideData(items: List<LbSurface>) : HashMap<String, MutableList<LbSurface>> {
        val dataMap = hashMapOf<String, MutableList<LbSurface>>()
        for (item in items) {
            if (dataMap.containsKey(item.sport)) {
                val list = dataMap.get(item.sport)
                list?.add(item)
            } else {
                val list = mutableListOf<LbSurface>()
                list.add(item)
                item.sport?.let {
                    dataMap.put(it, list)
                }
            }
        }
        return dataMap
    }

    private suspend fun getData(): List<LbSurface> =
        withContext(Dispatchers.IO) {
            val dataRepository= DataRepository()
            val responseData = dataRepository.requestData()
            val gson = Gson()
            val type: Type = object : TypeToken<List<LbSurface>>() {}.type
            gson.fromJson(responseData, type)
        }
}