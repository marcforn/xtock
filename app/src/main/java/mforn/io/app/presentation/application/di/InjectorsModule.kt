package mforn.io.app.presentation.application.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mforn.io.app.presentation.home.di.HomeModule
import mforn.io.app.presentation.home.view.activity.HomeActivity
import mforn.io.core.presentation.notifications.di.NotificationsModule
import mforn.io.core.presentation.notifications.view.fragment.NotificationsFragment
import mforn.io.core.presentation.search.di.SearchStockModule
import mforn.io.core.presentation.search.view.fragment.SearchStockFragment
import mforn.io.sector.presentation.di.SectorPerformanceModule
import mforn.io.sector.presentation.view.fragment.SectorPerformanceFragment


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

}