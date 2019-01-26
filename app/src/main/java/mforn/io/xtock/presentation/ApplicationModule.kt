package mforn.io.xtock.presentation

import android.app.Application
import dagger.Binds
import dagger.Module
import mforn.io.xtock.presentation.application.XtockApplication

@Module
abstract class ApplicationModule {

    @Binds
    abstract fun bindApplication(application: XtockApplication): Application

}