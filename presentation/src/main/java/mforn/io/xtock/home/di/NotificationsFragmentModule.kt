package mforn.io.xtock.home.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.xtock.common.di.FragmentModule
import mforn.io.xtock.home.view.fragment.NotificationsFragment

@Module
abstract class NotificationsFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: NotificationsFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (NotificationsFragmentModule::class)])
class NotificationsModule