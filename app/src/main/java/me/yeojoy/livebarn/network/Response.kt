package me.yeojoy.livebarn.network

interface Response {
    fun onResult(responseCode: Int, responseTest: String?)
    fun onFail(responseCode: Int, errorMessage: String?)
}