package mforn.io.common.data.resources.configuration.di

import android.content.res.Resources
import dagger.Module
import dagger.Provides
import mforn.io.common.data.resources.ResourcesRepositoryImpl
import mforn.io.common.domain.repository.ResourcesRepository
import javax.inject.Singleton


// TODO mforn: 1/27/19 check injection
@Module
class ResourcesModule {

    //region Resources Repository
    @Provides
    @Singleton
    fun provideResourcesRepository(resources: Resources): ResourcesRepository {
        return ResourcesRepositoryImpl(resources)
    }
    //endregion

}