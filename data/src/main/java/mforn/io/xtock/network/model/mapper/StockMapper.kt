package mforn.io.xtock.network.model.mapper

import mforn.io.xtock.model.SectorPerformanceEntity
import mforn.io.xtock.model.StockChartEntity
import mforn.io.xtock.network.model.response.SectorPerformanceDto
import mforn.io.xtock.network.model.response.StockChartDto


fun List<StockChartDto>.convertToStockChartEntityList(): List<StockChartEntity> {
    val entityModel = mutableListOf<StockChartEntity>()

    for (item in this) {
        entityModel.add(item.convertToStockChartEntity())
    }

    return entityModel
}

fun StockChartDto.convertToStockChartEntity(): StockChartEntity {
    with(this) {
        return StockChartEntity(date, changePercent, changeOverTime)
    }
}

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
