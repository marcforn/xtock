package mforn.io.xtock.network.model.mapper

import mforn.io.xtock.model.SymbolDataEntity
import mforn.io.xtock.network.model.response.SymbolDataDto


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

