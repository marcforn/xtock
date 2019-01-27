package mforn.io.xtock.presentation.home.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.xtock.presentation.common.di.FragmentModule
import mforn.io.xtock.presentation.home.view.fragment.NotificationsFragment

@Module
abstract class NotificationsFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: NotificationsFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (NotificationsFragmentModule::class)])
class NotificationsModule