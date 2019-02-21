package mforn.io.sector.data

import mforn.io.sector.domain.model.SectorPerformanceEntity
import mforn.io.sector.domain.repository.SectorRepository

class SectorRepositoryImpl(private val stockApi: StockApi) : SectorRepository {

    override suspend fun getSectorPerformance(): List<SectorPerformanceEntity> {
        return stockApi.getSectorPerformance().await().convertToSectorPerformanceEntityList()
    }

}