package mforn.io.xtock.domain.repository

import mforn.io.xtock.data.webservice.model.response.SymbolDataDto

interface DataRepository {

    suspend fun getSymbols(): List<SymbolDataDto>

}
