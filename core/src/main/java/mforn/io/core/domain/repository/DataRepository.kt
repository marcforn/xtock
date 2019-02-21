package mforn.io.core.domain.repository

import mforn.io.core.domain.model.SymbolDataEntity


interface DataRepository {

    suspend fun getSymbols(): List<SymbolDataEntity>

}
