package me.yeojoy.livebarn.network

object NetworkConstants {
    const val API_URL = "https://2hsjstzo71.execute-api.us-east-1.amazonaws.com/prod/livebarn-interview-project"

    /* retrofit2 timeout */
    const val READ_TIMEOUT = 10000
    const val CONNECTION_TIMEOUT = 10000

    const val METHOD_GET = "GET"
    const val CHARSET_NAME = "UTF-8"

    const val SERVER_ERROR_CODE = 500
    const val CLIENT_ERROR_CODE = 400
}