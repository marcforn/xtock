package mforn.io.sector.domain.model


data class SectorPerformanceEntity(
    val type: String,
    val name: String,
    val performance: Double,
    val lastUpdated: Long
)

