package mforn.io.core.presentation.home.di

import androidx.appcompat.app.AppCompatActivity
import dagger.Binds
import dagger.Module
import mforn.io.core.presentation.common.di.ActivityModule
import mforn.io.core.presentation.home.view.activity.HomeActivity

@Module
abstract class HomeActivityModule {

    @Binds
    abstract fun bindActivity(activity: HomeActivity): AppCompatActivity

}

@Module(includes = [(ActivityModule::class), (HomeActivityModule::class)])
class HomeModule