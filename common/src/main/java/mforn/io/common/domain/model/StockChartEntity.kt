package mforn.io.common.domain.model


data class StockChartEntity(
    val date: String,
    val changePercent: Double,
    val changeOverTime: Double
)

