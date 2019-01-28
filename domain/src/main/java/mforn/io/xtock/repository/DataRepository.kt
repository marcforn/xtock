package mforn.io.xtock.repository

import mforn.io.xtock.model.SymbolDataEntity


interface DataRepository {

    suspend fun getSymbols(): List<SymbolDataEntity>

}
