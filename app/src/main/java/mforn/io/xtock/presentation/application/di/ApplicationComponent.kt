package mforn.io.xtock.presentation.application.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import mforn.io.xtock.data.webservice.configuration.di.WebserviceModule
import mforn.io.xtock.presentation.application.view.XtockApplication
import mforn.io.xtock.presentation.common.di.InjectorsModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        (AndroidInjectionModule::class),
        (ApplicationModule::class),
        (WebserviceModule::class),
        (InjectorsModule::class)
    ]
)
internal interface ApplicationComponent : AndroidInjector<XtockApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<XtockApplication>()
}

