package mforn.io.core.presentation.common.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mforn.io.core.presentation.home.di.HomeModule
import mforn.io.core.presentation.home.view.activity.HomeActivity
import mforn.io.core.presentation.notifications.di.NotificationsModule
import mforn.io.core.presentation.notifications.view.fragment.NotificationsFragment
import mforn.io.core.presentation.search.di.SearchStockModule
import mforn.io.core.presentation.search.view.fragment.SearchStockFragment
import mforn.io.core.presentation.sector.di.SectorPerformanceModule
import mforn.io.core.presentation.sector.view.fragment.SectorPerformanceFragment


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