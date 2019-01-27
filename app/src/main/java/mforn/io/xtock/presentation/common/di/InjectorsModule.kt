package mforn.io.xtock.presentation.common.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import mforn.io.xtock.presentation.home.di.HomeModule
import mforn.io.xtock.presentation.home.di.SearchStockModule
import mforn.io.xtock.presentation.home.di.SectorPerformanceFragmentModule
import mforn.io.xtock.presentation.home.view.activity.HomeActivity
import mforn.io.xtock.presentation.home.view.fragment.SearchStockragment
import mforn.io.xtock.presentation.home.view.fragment.SectorPerformanceFragment


@Module
abstract class InjectorsModule {

    //region Activity
    @ContributesAndroidInjector(modules = [(HomeModule::class)])
    abstract fun bindHomeActivity(): HomeActivity
    //endregion

    //region Fragments
    @ContributesAndroidInjector(modules = [(SectorPerformanceFragmentModule::class)])
    abstract fun bindSectorPerformanceFragment(): SectorPerformanceFragment

    @ContributesAndroidInjector(modules = [(SearchStockModule::class)])
    abstract fun bindSearchStockFragment(): SearchStockragment
    //endregion

    //region Service

    //endregion

}