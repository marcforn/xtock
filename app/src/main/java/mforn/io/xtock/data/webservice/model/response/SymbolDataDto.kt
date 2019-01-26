package mforn.io.xtock.data.webservice.model.response

import com.google.gson.annotations.SerializedName

data class SymbolDataDto(
    @SerializedName("symbol")
    val symbol : String,
    @SerializedName("name")
    val name : String,
    @SerializedName("date")
    val date: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("iexId")
    val iexId: Int
)

