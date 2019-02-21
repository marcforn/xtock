package mforn.io.core.data.network.model.mapper

import mforn.io.core.data.network.model.response.SectorPerformanceDto
import mforn.io.core.data.network.model.response.StockChartDto
import mforn.io.core.domain.model.SectorPerformanceEntity
import mforn.io.core.domain.model.StockChartEntity

// TODO mforn: 2/21/19 use Func1 pattern

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
