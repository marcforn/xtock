package mforn.io.common.data.network.configuration.api

import kotlinx.coroutines.Deferred
import mforn.io.common.data.network.configuration.PATH_DATA_SYMBOLS
import mforn.io.common.data.network.model.response.SymbolDataDto
import retrofit2.http.GET

interface DataApi {

    @GET(PATH_DATA_SYMBOLS)
    fun getSymbols(): Deferred<List<SymbolDataDto>>

}