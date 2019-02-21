package mforn.io.common.data.network.configuration.di

import dagger.Module
import dagger.Provides
import mforn.io.common.data.network.configuration.RetrofitAdapter
import mforn.io.common.data.network.configuration.api.DataApi
import mforn.io.common.data.network.configuration.api.StockApi
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
class NetworkModule {

    // region Retrofit Configuration
    @Provides
    @Singleton
    fun provideRetrofitAdapter(): Retrofit {
        return RetrofitAdapter().retrofit
    }
    //endregion

    // region Network API
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

}