package mforn.io.xtock.presentation.application.view

import dagger.android.AndroidInjector
import mforn.io.xtock.presentation.DaggerApplicationComponent
import mforn.io.xtock.presentation.application.BaseApplication

class XtockApplication : BaseApplication() {


    override fun applicationInjector(): AndroidInjector<out dagger.android.DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}