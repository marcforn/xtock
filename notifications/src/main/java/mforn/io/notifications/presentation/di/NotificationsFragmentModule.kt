package mforn.io.notifications.presentation.di

import androidx.fragment.app.Fragment
import dagger.Binds
import dagger.Module
import mforn.io.common.presentation.di.FragmentModule
import mforn.io.notifications.presentation.fragment.NotificationsFragment

@Module
abstract class NotificationsFragmentModule {

    @Binds
    abstract fun bindFragment(fragment: NotificationsFragment): Fragment

}

@Module(includes = [(FragmentModule::class), (NotificationsFragmentModule::class)])
class NotificationsModule