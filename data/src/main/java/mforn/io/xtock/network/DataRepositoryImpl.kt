package mforn.io.xtock.network

import mforn.io.xtock.network.model.mapper.convertToSymbolDataEntityList
import mforn.io.xtock.model.SymbolDataEntity
import mforn.io.xtock.repository.DataRepository
import mforn.io.xtock.network.configuration.api.DataApi

class DataRepositoryImpl(private val dataApi: DataApi) : DataRepository {

    override suspend fun getSymbols(): List<SymbolDataEntity> {
        return dataApi.getSymbols().await().convertToSymbolDataEntityList()
    }
}