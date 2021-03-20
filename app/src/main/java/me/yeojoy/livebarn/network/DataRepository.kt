package me.yeojoy.livebarn.network

import me.yeojoy.livebarn.model.LbSurface
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class DataRepository {

    fun requestData() : String {
        val httpConnection = getGetMethodConnection(NetworkConstants.API_URL)

        when (httpConnection.responseCode) {
            HttpURLConnection.HTTP_OK -> {
                val stringBuilder = StringBuilder()
                val bufferedReader = BufferedReader(InputStreamReader(httpConnection.inputStream))
                while (true) {
                    val readString: String = bufferedReader.readLine() ?: break
                    stringBuilder.append(readString)
                }
                return stringBuilder.toString()
            }
            else -> return ""
        }
    }

    private fun getGetMethodConnection(urlAddress: String): HttpURLConnection {
        val url = URL(urlAddress)
        val httpConnection: HttpURLConnection = url.openConnection() as HttpURLConnection
        httpConnection.readTimeout = NetworkConstants.READ_TIMEOUT
        httpConnection.connectTimeout = NetworkConstants.CONNECTION_TIMEOUT
        httpConnection.requestMethod = NetworkConstants.METHOD_GET
//        val outputStream = httpConnection.outputStream
//        val bufferedWriter = BufferedWriter(OutputStreamWriter(outputStream, NetworkConstants.CHARSET_NAME))
        return httpConnection
    }
}