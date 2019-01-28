package mforn.io.xtock.webservice.model.response

import com.google.gson.annotations.SerializedName

data class StockChartDto(
    @SerializedName("date")
    val date: String,
    @SerializedName("changePercent")
    val changePercent: Double,
    @SerializedName("changeOverTime")
    val changeOverTime: Double
)

