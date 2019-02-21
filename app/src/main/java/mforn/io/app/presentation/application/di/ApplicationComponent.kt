package mforn.io.app.presentation.application.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import mforn.io.app.presentation.application.view.XtockApplication
import mforn.io.common.data.network.configuration.di.NetworkModule
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

