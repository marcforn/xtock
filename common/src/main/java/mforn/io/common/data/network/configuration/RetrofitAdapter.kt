package mforn.io.common.data.network.configuration

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitAdapter {

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .client(setOkHttpClient())
        .build()

    private fun setOkHttpClient(): OkHttpClient {
        val httpClient = OkHttpClient.Builder()

        // Logging Okhhtp requests
        val logging = HttpLoggingInterceptor()
        logging.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE

        httpClient.addInterceptor(logging)

        // Setting Connection Timeout
        httpClient.connectTimeout(TIME_OUT_MILLIS, TimeUnit.MILLISECONDS)
        httpClient.writeTimeout(TIME_OUT_MILLIS, TimeUnit.MILLISECONDS)
        httpClient.readTimeout(TIME_OUT_MILLIS, TimeUnit.MILLISECONDS)

        //Sets Redirects
        httpClient.followRedirects(true)
        httpClient.followSslRedirects(true)

        return httpClient.build()
    }

}