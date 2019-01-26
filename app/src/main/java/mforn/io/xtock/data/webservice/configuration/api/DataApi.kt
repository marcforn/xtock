package mforn.io.xtock.data.webservice.configuration.api

import mforn.io.xtock.data.webservice.configuration.PATH_STOCK
import mforn.io.xtock.data.webservice.model.response.SymbolDataDto
import retrofit2.Call
import retrofit2.http.GET

interface DataApi {

    @GET(PATH_STOCK)
    fun getStockChart(): Call<List<SymbolDataDto>>

}