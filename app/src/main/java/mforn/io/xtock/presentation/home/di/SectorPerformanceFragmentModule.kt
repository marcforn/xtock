package mforn.io.xtock.presentation.home.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import mforn.io.xtock.presentation.common.di.FragmentModule
import mforn.io.xtock.presentation.home.view.fragment.SectorPerformanceFragment

@Module
abstract class SectorPerformanceFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: SectorPerformanceFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (SectorPerformanceFragmentModule::class)])
class SectorPerformanceModule {

    // TODO mforn: 1/27/19 remove after testing
    @Provides
    fun providesAux(): String {
        return "Test String"

    }
}