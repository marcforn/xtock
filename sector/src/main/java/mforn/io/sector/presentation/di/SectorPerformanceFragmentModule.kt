package mforn.io.sector.presentation.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.common.presentation.di.FragmentModule
import mforn.io.sector.presentation.view.fragment.SectorPerformanceFragment

@Module
abstract class SectorPerformanceFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: SectorPerformanceFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (SectorPerformanceFragmentModule::class)])
class SectorPerformanceModule