package mforn.io.xtock.network.configuration.api

import kotlinx.coroutines.Deferred
import mforn.io.xtock.network.configuration.PATH_SECTOR_PERFORMANCE
import mforn.io.xtock.network.configuration.PATH_STOCK
import mforn.io.xtock.network.configuration.PERIOD
import mforn.io.xtock.network.configuration.STOCK
import mforn.io.xtock.network.model.response.SectorPerformanceDto
import mforn.io.xtock.network.model.response.StockChartDto
import retrofit2.http.GET
import retrofit2.http.Path

enum class PeriodOptionDto(val value: String) {
    ONE_DAY("1d"),
    ONE_MONTH("1m"),
    THREE_MONTH("3m"),
    SIX_MONTH("6m"),
    ONE_YEAR("1y"),
    TWO_YEARS("2y"),
    FIVE_YEARS("5y")
}

interface StockApi {

    @GET(PATH_STOCK)
    fun getStockChart(@Path(STOCK) stock: String, @Path(PERIOD) period: String): Deferred<List<StockChartDto>>

    @GET(PATH_SECTOR_PERFORMANCE)
    fun getSectorPerformance(): Deferred<List<SectorPerformanceDto>>
}