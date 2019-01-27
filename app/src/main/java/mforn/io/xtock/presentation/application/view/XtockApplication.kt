package mforn.io.xtock.presentation.application.view

import dagger.android.AndroidInjector
import mforn.io.xtock.presentation.application.BaseApplication
import mforn.io.xtock.presentation.application.di.DaggerApplicationComponent

class XtockApplication : BaseApplication() {


    override fun applicationInjector(): AndroidInjector<out dagger.android.DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}