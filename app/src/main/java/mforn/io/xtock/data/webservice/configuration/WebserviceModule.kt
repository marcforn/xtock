package mforn.io.xtock.data.webservice.configuration

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import mforn.io.xtock.BuildConfig
import mforn.io.xtock.data.webservice.configuration.api.DataApi
import mforn.io.xtock.data.webservice.configuration.api.StockApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
public class WebserviceModule() {

    @Provides
    @Singleton
    fun provideRetrofitAdapter(): Retrofit {
        val gson = GsonBuilder().create()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(setOkHttpClient())
            .build()
    }

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


    @Provides
    @Singleton
    fun provideChartApi(retrofit: Retrofit): StockApi {
        return retrofit.create(StockApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDataApi(retrofit: Retrofit): DataApi {
        return retrofit.create(DataApi::class.java)
    }


}