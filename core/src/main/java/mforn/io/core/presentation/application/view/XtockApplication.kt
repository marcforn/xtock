package mforn.io.core.presentation.application.view

import dagger.android.AndroidInjector
import mforn.io.core.presentation.application.di.DaggerApplicationComponent

class XtockApplication : BaseApplication() {


    override fun applicationInjector(): AndroidInjector<out dagger.android.DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}