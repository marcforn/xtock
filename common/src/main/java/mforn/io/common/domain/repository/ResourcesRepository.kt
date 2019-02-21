package mforn.io.common.domain.repository


interface ResourcesRepository {

    fun getString(resourceId: Int): String

    fun getInt(resourceId: Int): Int

    fun getBoolean(resourceId: Int): Boolean
}
