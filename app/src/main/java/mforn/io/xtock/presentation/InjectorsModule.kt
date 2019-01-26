package mforn.io.xtock.presentation

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mforn.io.xtock.presentation.home.HomeActivity


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