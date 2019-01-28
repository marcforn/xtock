package mforn.io.xtock.webservice

import mforn.io.xtock.mapper.convertToSymbolDataEntityList
import mforn.io.xtock.model.SymbolDataEntity
import mforn.io.xtock.repository.DataRepository
import mforn.io.xtock.webservice.configuration.api.DataApi

class DataRepositoryImpl(private val dataApi: DataApi) : DataRepository {

    override suspend fun getSymbols(): List<SymbolDataEntity> {
        return dataApi.getSymbols().await().convertToSymbolDataEntityList()
    }
}