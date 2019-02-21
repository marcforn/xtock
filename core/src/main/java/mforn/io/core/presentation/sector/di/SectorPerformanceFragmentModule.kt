package mforn.io.core.presentation.sector.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.core.presentation.common.di.FragmentModule
import mforn.io.core.presentation.sector.view.fragment.SectorPerformanceFragment

@Module
abstract class SectorPerformanceFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: SectorPerformanceFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (SectorPerformanceFragmentModule::class)])
class SectorPerformanceModule