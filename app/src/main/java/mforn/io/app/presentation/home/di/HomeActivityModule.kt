package mforn.io.app.presentation.home.di

import androidx.appcompat.app.AppCompatActivity
import dagger.Binds
import dagger.Module
import mforn.io.app.presentation.home.view.activity.HomeActivity
import mforn.io.common.presentation.di.ActivityModule

@Module
abstract class HomeActivityModule {

    @Binds
    abstract fun bindActivity(activity: HomeActivity): AppCompatActivity

}

@Module(includes = [(ActivityModule::class), (HomeActivityModule::class)])
class HomeModule