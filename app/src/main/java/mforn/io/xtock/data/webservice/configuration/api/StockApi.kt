package mforn.io.xtock.data.webservice.configuration.api

import mforn.io.xtock.data.webservice.configuration.PATH_SECTOR_PERFORMANCE
import mforn.io.xtock.data.webservice.configuration.PATH_STOCK
import mforn.io.xtock.data.webservice.configuration.PERIOD
import mforn.io.xtock.data.webservice.configuration.STOCK
import mforn.io.xtock.data.webservice.model.response.StockChartDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface StockApi {

    @GET(PATH_STOCK)
    fun getStockChart(
        @Path(STOCK) stock: String,
        @Path(PERIOD) period: String
    ): Call<List<StockChartDto>>

    @GET(PATH_SECTOR_PERFORMANCE)
    fun getSectorPerformance(): Call<List<StockChartDto>>

}