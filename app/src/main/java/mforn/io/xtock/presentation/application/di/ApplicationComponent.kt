package mforn.io.xtock.presentation.application.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import mforn.io.xtock.data.webservice.configuration.di.WebserviceModule
import mforn.io.xtock.presentation.application.view.XtockApplication
import mforn.io.xtock.presentation.common.di.InjectorsModule
import mforn.io.xtock.presentation.common.di.ViewModelModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        (AndroidSupportInjectionModule::class),
        (ApplicationModule::class),
        (ViewModelModule::class),
        (WebserviceModule::class),
        (InjectorsModule::class)
    ]
)
internal interface ApplicationComponent : AndroidInjector<XtockApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<XtockApplication>()
}

