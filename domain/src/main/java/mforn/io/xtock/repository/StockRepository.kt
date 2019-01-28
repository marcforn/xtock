package mforn.io.xtock.repository

import mforn.io.xtock.model.SectorPerformanceEntity
import mforn.io.xtock.model.StockChartEntity

enum class PeriodOption {
    ONE_DAY,
    ONE_MONTH,
    THREE_MONTH,
    SIX_MONTH,
    ONE_YEAR,
    TWO_YEARS,
    FIVE_YEARS
}

interface StockRepository {

    suspend fun getStockChart(stock: String, period: PeriodOption): List<StockChartEntity>

    suspend fun getSectorPerformance(): List<SectorPerformanceEntity>

}
