package me.yeojoy.livebarn.network

object NetworkConstants {
    const val API_URL = "https://2hsjstzo71.execute-api.us-east-1.amazonaws.com/prod/livebarn-interview-project"

    /* retrofit2 timeout */
    const val READ_TIMEOUT = 10000
    const val CONNECTION_TIMEOUT = 10000

    const val METHOD_GET = "GET"

    const val ODD_IMAGE_URL = "https://via.placeholder.com/300/202020"
    const val EVEN_IMAGE_URL = "https://via.placeholder.com/300/808080"

    const val HEADER_USER_AGENT = "User-Agent"
}