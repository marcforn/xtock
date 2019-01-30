package mforn.io.xtock.sector.model.mapper

import mforn.io.xtock.model.SectorPerformanceEntity
import mforn.io.xtock.sector.model.SectorPerformanceViewData


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
