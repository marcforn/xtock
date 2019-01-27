package mforn.io.xtock.presentation.common.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mforn.io.xtock.presentation.home.di.HomeModule
import mforn.io.xtock.presentation.home.view.activity.HomeActivity


@Module
abstract class InjectorsModule {

    //region Activity
    @ContributesAndroidInjector(modules = [(HomeModule::class)])
    abstract fun bindHomeActivity(): HomeActivity
    //endregion

    //region Fragments

    //endregion

    //region Service

    //endregion

}