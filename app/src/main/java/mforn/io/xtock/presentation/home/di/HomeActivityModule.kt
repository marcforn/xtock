package mforn.io.xtock.presentation.home.di

import android.app.Activity
import dagger.Binds
import dagger.Module
import mforn.io.xtock.presentation.common.di.ActivityModule
import mforn.io.xtock.presentation.home.view.activity.HomeActivity

@Module
abstract class HomeActivityModule {

    @Binds
    abstract fun bindActivity(activity: HomeActivity): Activity

}

@Module(includes = [(ActivityModule::class), (HomeActivityModule::class)])
class HomeModule