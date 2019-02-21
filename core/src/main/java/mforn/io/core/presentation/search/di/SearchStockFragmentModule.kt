package mforn.io.core.presentation.search.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.common.presentation.di.FragmentModule
import mforn.io.core.presentation.search.view.fragment.SearchStockFragment

@Module
abstract class SearchStockFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: SearchStockFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (SearchStockFragmentModule::class)])
class SearchStockModule