package mforn.io.sector.domain.repository

import mforn.io.sector.domain.model.SectorPerformanceEntity


interface SectorRepository {

    suspend fun getSectorPerformance(): List<SectorPerformanceEntity>

}
