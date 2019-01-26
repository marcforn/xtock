package mforn.io.xtock.domain.repository

import mforn.io.xtock.data.webservice.model.response.SectorPerformanceDto
import mforn.io.xtock.data.webservice.model.response.StockChartDto

interface StockRepository {

    suspend fun getStockChart(stock: String, period: String): List<StockChartDto>

    suspend fun getSectorPerformance(): List<SectorPerformanceDto>

}
