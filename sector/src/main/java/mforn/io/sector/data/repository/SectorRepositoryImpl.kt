package mforn.io.sector.data.repository

import mforn.io.common.data.network.configuration.api.StockApi
import mforn.io.sector.data.model.mapper.convertToSectorPerformanceEntityList
import mforn.io.sector.domain.model.SectorPerformanceEntity
import mforn.io.sector.domain.repository.SectorRepository

class SectorRepositoryImpl(private val stockApi: StockApi) : SectorRepository {

    override suspend fun getSectorPerformance(): List<SectorPerformanceEntity> {
        return stockApi.getSectorPerformance().await().convertToSectorPerformanceEntityList()
    }

}