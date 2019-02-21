package mforn.io.core.domain.model


data class SectorPerformanceEntity(
    val type: String,
    val name: String,
    val performance: Double,
    val lastUpdated: Long
)

