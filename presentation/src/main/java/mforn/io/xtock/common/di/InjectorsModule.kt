package mforn.io.xtock.common.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mforn.io.xtock.home.di.HomeModule
import mforn.io.xtock.home.di.NotificationsModule
import mforn.io.xtock.home.di.SearchStockModule
import mforn.io.xtock.home.di.SectorPerformanceModule
import mforn.io.xtock.home.view.activity.HomeActivity
import mforn.io.xtock.home.view.fragment.NotificationsFragment
import mforn.io.xtock.home.view.fragment.SearchStockFragment
import mforn.io.xtock.home.view.fragment.SectorPerformanceFragment


@Module
abstract class InjectorsModule {

    //region Activity
    @ContributesAndroidInjector(modules = [(HomeModule::class)])
    abstract fun bindHomeActivity(): HomeActivity
    //endregion

    //region Fragments
    @ContributesAndroidInjector(modules = [(SearchStockModule::class)])
    abstract fun bindSearchFragment(): SearchStockFragment

    @ContributesAndroidInjector(modules = [(SectorPerformanceModule::class)])
    abstract fun bindSectorPerformanceFragment(): SectorPerformanceFragment

    @ContributesAndroidInjector(modules = [(NotificationsModule::class)])
    abstract fun bindNotificationsFragment(): NotificationsFragment
    //endregion

    //region Service
    // TODO mforn: 1/27/19 use WorkManager
    //endregion

}