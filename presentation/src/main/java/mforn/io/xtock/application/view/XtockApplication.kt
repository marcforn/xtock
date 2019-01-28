package mforn.io.xtock.application.view

import dagger.android.AndroidInjector
import mforn.io.xtock.application.BaseApplication
import mforn.io.xtock.application.di.DaggerApplicationComponent

class XtockApplication : BaseApplication() {


    override fun applicationInjector(): AndroidInjector<out dagger.android.DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}