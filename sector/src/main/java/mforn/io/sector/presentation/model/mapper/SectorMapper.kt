package mforn.io.sector.presentation.model.mapper

import mforn.io.sector.domain.model.SectorPerformanceEntity
import mforn.io.sector.presentation.model.SectorPerformanceViewData


fun List<SectorPerformanceEntity>.convertToSectorPerformanceViewList(): List<SectorPerformanceViewData> {
    val entityModel = mutableListOf<SectorPerformanceViewData>()

    for (item in this) {
        entityModel.add(item.convertToSectorPerformanceView())
    }

    return entityModel
}

fun SectorPerformanceEntity.convertToSectorPerformanceView(): SectorPerformanceViewData {
    with(this) {
        return mforn.io.sector.presentation.model.SectorPerformanceViewData(name, performance, lastUpdated.toString())
    }
}
