package mforn.io.common.domain.repository

import mforn.io.common.domain.model.SymbolDataEntity


interface DataRepository {

    suspend fun getSymbols(): List<SymbolDataEntity>

}
