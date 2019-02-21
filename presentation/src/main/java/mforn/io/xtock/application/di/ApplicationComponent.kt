package mforn.io.xtock.application.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import mforn.io.core.data.network.configuration.di.NetworkModule
import mforn.io.xtock.application.view.XtockApplication
import mforn.io.xtock.common.di.InjectorsModule
import mforn.io.xtock.common.di.ViewModelModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        (AndroidSupportInjectionModule::class),
        (ApplicationModule::class),
        (ViewModelModule::class),
        (NetworkModule::class),
        (InjectorsModule::class)
    ]
)
internal interface ApplicationComponent : AndroidInjector<XtockApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<XtockApplication>()
}

