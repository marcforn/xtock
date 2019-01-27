package mforn.io.xtock.presentation.home.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.xtock.presentation.common.di.FragmentModule
import mforn.io.xtock.presentation.home.view.fragment.SearchStockFragment

@Module
abstract class SearchStockFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: SearchStockFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (SearchStockFragmentModule::class)])
class SearchStockModule