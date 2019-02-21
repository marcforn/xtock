package mforn.io.core.data.network.model.response

import com.google.gson.annotations.SerializedName

data class SymbolDataDto(
    @SerializedName("symbol")
    val symbol : String,
    @SerializedName("name")
    val name : String,
    @SerializedName("date")
    val date: String,
    @SerializedName("type")
    val type: String
)

