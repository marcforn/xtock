package mforn.io.common.data.resources

import android.content.res.Resources
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes
import mforn.io.common.domain.repository.ResourcesRepository


class ResourcesRepositoryImpl(private val resources: Resources) : ResourcesRepository {

    override fun getString(@StringRes resourceId: Int): String {
        return resources.getString(resourceId)
    }

    override fun getInt(@IntegerRes resourceId: Int): Int {
        return resources.getInteger(resourceId)
    }

    override fun getBoolean(resourceId: Int): Boolean {
        return resources.getBoolean(resourceId)
    }
}
