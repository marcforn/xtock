package mforn.io.app.presentation.application.di

import android.app.Application
import dagger.Binds
import dagger.Module
import mforn.io.app.presentation.application.view.XtockApplication

@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindApplication(application: XtockApplication): Application

}