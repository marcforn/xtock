package mforn.io.xtock.network.configuration.api

import kotlinx.coroutines.Deferred
import mforn.io.xtock.network.configuration.PATH_DATA_SYMBOLS
import mforn.io.xtock.network.model.response.SymbolDataDto
import retrofit2.http.GET

interface DataApi {

    @GET(PATH_DATA_SYMBOLS)
    fun getSymbols(): Deferred<List<SymbolDataDto>>

}