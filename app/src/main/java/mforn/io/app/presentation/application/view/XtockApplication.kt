package mforn.io.app.presentation.application.view

import dagger.android.AndroidInjector
import mforn.io.app.presentation.application.di.DaggerApplicationComponent

class XtockApplication : BaseApplication() {


    override fun applicationInjector(): AndroidInjector<out dagger.android.DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}