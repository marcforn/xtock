package mforn.io.core.data.network.configuration.di

import dagger.Module
import dagger.Provides
import mforn.io.core.data.network.DataRepositoryImpl
import mforn.io.core.data.network.StockRepositoryImpl
import mforn.io.core.data.network.configuration.RetrofitAdapter
import mforn.io.core.data.network.configuration.api.DataApi
import mforn.io.core.data.network.configuration.api.StockApi
import mforn.io.core.domain.repository.DataRepository
import mforn.io.core.domain.repository.StockRepository
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

    //region Network Repository
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