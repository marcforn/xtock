package mforn.io.core.data.network.model.mapper

import mforn.io.common.data.network.model.response.StockChartDto
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

