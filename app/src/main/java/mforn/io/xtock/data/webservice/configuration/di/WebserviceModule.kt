package mforn.io.xtock.data.webservice.configuration.di

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import mforn.io.xtock.BuildConfig
import mforn.io.xtock.data.webservice.DataRepositoryImpl
import mforn.io.xtock.data.webservice.StockRepositoryImpl
import mforn.io.xtock.data.webservice.configuration.BASE_URL
import mforn.io.xtock.data.webservice.configuration.TIME_OUT_MILLIS
import mforn.io.xtock.data.webservice.configuration.api.DataApi
import mforn.io.xtock.data.webservice.configuration.api.StockApi
import mforn.io.xtock.domain.repository.DataRepository
import mforn.io.xtock.domain.repository.StockRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class WebserviceModule {

    // region Retrofit Configuration
    @Provides
    @Singleton
    fun provideRetrofitAdapter(): Retrofit {
        val gson = GsonBuilder().create()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
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
    //endregion

    // region Webservice API
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
    //endregion

    //region Webservice Repository
    @Provides
    @Singleton
    fun provideDataRepository(dataApi: DataApi): DataRepository {
        return DataRepositoryImpl(dataApi)
    }

    @Provides
    @Singleton
    fun provideStockRepository(stockApi: StockApi): StockRepository {
        return StockRepositoryImpl(stockApi)
    }
    //endregion

}