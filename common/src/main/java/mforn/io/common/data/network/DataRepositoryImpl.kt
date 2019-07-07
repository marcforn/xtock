package mforn.io.common.data.network

import mforn.io.common.data.network.configuration.api.DataApi
import mforn.io.common.data.network.model.mapper.convertToSymbolDataEntityList
import mforn.io.common.domain.model.SymbolDataEntity
import mforn.io.common.domain.repository.DataRepository

class DataRepositoryImpl(private val dataApi: DataApi) : DataRepository {

    override suspend fun getSymbols(): List<SymbolDataEntity> {
        return dataApi.getSymbols().await().convertToSymbolDataEntityList()
    }
}