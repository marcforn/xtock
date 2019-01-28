package mforn.io.xtock.model


data class StockChartEntity(
    val date: String,
    val changePercent: Double,
    val changeOverTime: Double
)

