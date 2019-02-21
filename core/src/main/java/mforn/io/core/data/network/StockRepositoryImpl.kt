package mforn.io.core.data.network

import mforn.io.common.data.network.configuration.api.PeriodOptionDto
import mforn.io.common.data.network.configuration.api.StockApi
import mforn.io.core.data.network.model.mapper.convertToStockChartEntityList
import mforn.io.core.domain.model.StockChartEntity
import mforn.io.core.domain.repository.PeriodOption
import mforn.io.core.domain.repository.StockRepository

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

}