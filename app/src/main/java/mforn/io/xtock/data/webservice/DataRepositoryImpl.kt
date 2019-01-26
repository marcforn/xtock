package mforn.io.xtock.data.webservice

import mforn.io.xtock.data.webservice.configuration.api.DataApi
import mforn.io.xtock.data.webservice.model.response.SymbolDataDto
import mforn.io.xtock.domain.repository.DataRepository

public class DataRepositoryImpl(private val dataApi: DataApi) : DataRepository {

    override suspend fun getSymbols(): List<SymbolDataDto> {
        return dataApi.getSymbols().await()
    }
}