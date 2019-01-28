package mforn.io.xtock.webservice

import mforn.io.xtock.mapper.convertToSectorPerformanceEntityList
import mforn.io.xtock.mapper.convertToStockChartEntityList
import mforn.io.xtock.model.SectorPerformanceEntity
import mforn.io.xtock.model.StockChartEntity
import mforn.io.xtock.repository.PeriodOption
import mforn.io.xtock.repository.StockRepository
import mforn.io.xtock.webservice.configuration.api.PeriodOptionDto
import mforn.io.xtock.webservice.configuration.api.StockApi

class StockRepositoryImpl(private val stockApi: StockApi) : StockRepository {

    override suspend fun getStockChart(stock: String, period: PeriodOption): List<StockChartEntity> {
        return stockApi.getStockChart(stock, mapPeriod(period)).await().convertToStockChartEntityList()
    }

    private fun mapPeriod(period: PeriodOption): String {
        return when (period) {
            PeriodOption.ONE_DAY -> PeriodOptionDto.ONE_DAY.value
            PeriodOption.ONE_MONTH -> PeriodOptionDto.ONE_MONTH.value
            PeriodOption.THREE_MONTH -> PeriodOptionDto.THREE_MONTH.value
            PeriodOption.SIX_MONTH -> PeriodOptionDto.SIX_MONTH.value
            PeriodOption.ONE_YEAR -> PeriodOptionDto.ONE_YEAR.value
            PeriodOption.TWO_YEARS -> PeriodOptionDto.TWO_YEARS.value
            PeriodOption.FIVE_YEARS -> PeriodOptionDto.FIVE_YEARS.value
        }
    }

    override suspend fun getSectorPerformance(): List<SectorPerformanceEntity> {
        return stockApi.getSectorPerformance().await().convertToSectorPerformanceEntityList()
    }

}