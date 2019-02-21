package mforn.io.app.presentation.application.view

import dagger.android.AndroidInjector

class XtockApplication : BaseApplication() {


    override fun applicationInjector(): AndroidInjector<out dagger.android.DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}