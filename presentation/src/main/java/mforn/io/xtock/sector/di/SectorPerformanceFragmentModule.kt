package mforn.io.xtock.sector.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.xtock.common.di.FragmentModule
import mforn.io.xtock.sector.view.fragment.SectorPerformanceFragment

@Module
abstract class SectorPerformanceFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: SectorPerformanceFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (SectorPerformanceFragmentModule::class)])
class SectorPerformanceModule