package mforn.io.common.data.network.model.mapper

import mforn.io.common.data.network.model.response.SymbolDataDto
import mforn.io.common.domain.model.SymbolDataEntity


fun List<SymbolDataDto>.convertToSymbolDataEntityList(): List<SymbolDataEntity> {
    val entityModel = mutableListOf<SymbolDataEntity>()

    for (item in this) {
        entityModel.add(item.convertToSymbolDataEntity())
    }

    return entityModel
}

fun SymbolDataDto.convertToSymbolDataEntity(): SymbolDataEntity {
    with(this) {
        return SymbolDataEntity(symbol, name, date, type)
    }
}

