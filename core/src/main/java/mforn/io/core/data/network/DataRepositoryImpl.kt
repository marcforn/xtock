package mforn.io.core.data.network

import mforn.io.core.data.network.configuration.api.DataApi
import mforn.io.core.data.network.model.mapper.convertToSymbolDataEntityList
import mforn.io.core.domain.model.SymbolDataEntity
import mforn.io.core.domain.repository.DataRepository

class DataRepositoryImpl(private val dataApi: DataApi) : DataRepository {

    override suspend fun getSymbols(): List<SymbolDataEntity> {
        return dataApi.getSymbols().await().convertToSymbolDataEntityList()
    }
}