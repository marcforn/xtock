package mforn.io.sector.data.model.mapper

import mforn.io.common.data.network.model.response.SectorPerformanceDto
import mforn.io.sector.domain.model.SectorPerformanceEntity

// TODO mforn: 2/21/19 use Func1 pattern
fun List<SectorPerformanceDto>.convertToSectorPerformanceEntityList(): List<SectorPerformanceEntity> {
    val entityModel = mutableListOf<SectorPerformanceEntity>()

    for (item in this) {
        entityModel.add(item.convertToSectorPerformanceEntity())
    }

    return entityModel
}

fun SectorPerformanceDto.convertToSectorPerformanceEntity(): SectorPerformanceEntity {
    with(this) {
        return SectorPerformanceEntity(type, name, performance, lastUpdated)
    }
}
