package mforn.io.xtock.data.webservice.model.response

import com.google.gson.annotations.SerializedName

data class SectorPerformanceDto(
    @SerializedName("type")
    val type: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("performance")
    val performance: Double,
    @SerializedName("lastUpdated")
    val lastUpdated: Long
)

