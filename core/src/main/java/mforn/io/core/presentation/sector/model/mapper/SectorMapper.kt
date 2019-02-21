package mforn.io.core.presentation.sector.model.mapper

import mforn.io.core.domain.model.SectorPerformanceEntity
import mforn.io.core.presentation.sector.model.SectorPerformanceViewData


fun List<SectorPerformanceEntity>.convertToSectorPerformanceViewList(): List<SectorPerformanceViewData> {
    val entityModel = mutableListOf<SectorPerformanceViewData>()

    for (item in this) {
        entityModel.add(item.convertToSectorPerformanceView())
    }

    return entityModel
}

fun SectorPerformanceEntity.convertToSectorPerformanceView(): SectorPerformanceViewData {
    with(this) {
        return SectorPerformanceViewData(name, performance, lastUpdated.toString())
    }
}
