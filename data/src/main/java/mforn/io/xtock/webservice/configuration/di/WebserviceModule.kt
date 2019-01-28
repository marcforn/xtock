package mforn.io.xtock.webservice.configuration.di

import dagger.Module
import dagger.Provides
import mforn.io.xtock.repository.DataRepository
import mforn.io.xtock.repository.StockRepository
import mforn.io.xtock.webservice.DataRepositoryImpl
import mforn.io.xtock.webservice.StockRepositoryImpl
import mforn.io.xtock.webservice.configuration.RetrofitAdapter
import mforn.io.xtock.webservice.configuration.api.DataApi
import mforn.io.xtock.webservice.configuration.api.StockApi
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
class WebserviceModule {

    // region Retrofit Configuration
    @Provides
    @Singleton
    fun provideRetrofitAdapter(): Retrofit {
        return RetrofitAdapter().retrofit
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