package mforn.io.xtock.presentation

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.Provides
import mforn.io.xtock.presentation.home.HomeActivity

@Module
abstract class HomeActivityModule {

    @Binds
    abstract fun bindActivity(activity: HomeActivity): Activity

}

@Module(includes = [(ActivityModule::class), (HomeActivityModule::class)])
class HomeModule {

    // TODO mforn: 1/26/19
    @Provides
    fun providesAux(): String {
        return "Test String"

    }

}