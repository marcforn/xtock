package mforn.io.xtock.data.webservice

import mforn.io.xtock.data.webservice.configuration.api.StockApi
import mforn.io.xtock.data.webservice.model.response.SectorPerformanceDto
import mforn.io.xtock.data.webservice.model.response.StockChartDto
import mforn.io.xtock.domain.repository.StockRepository

public class StockRepositoryImpl(private val stockApi: StockApi) : StockRepository {

    override suspend fun getStockChart(stock :String, period: String): List<StockChartDto> {
        return stockApi.getStockChart(stock, period).await()
    }

    override suspend fun getSectorPerformance(): List<SectorPerformanceDto> {
        return stockApi.getSectorPerformance().await()
    }

}