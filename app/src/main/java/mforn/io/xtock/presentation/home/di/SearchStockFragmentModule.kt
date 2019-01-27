package mforn.io.xtock.presentation.home.di

import dagger.Binds
import dagger.Module
import mforn.io.xtock.presentation.common.di.FragmentModule
import mforn.io.xtock.presentation.common.view.BaseFragment
import mforn.io.xtock.presentation.home.view.fragment.SearchStockragment

@Module
abstract class SearchStockFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: SearchStockragment): BaseFragment

}

@Module(includes = [(FragmentModule::class), (SearchStockFragmentModule::class)])
class SearchStockModule