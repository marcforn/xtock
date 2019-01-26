package mforn.io.xtock.presentation.application

import dagger.android.AndroidInjector
import mforn.io.xtock.presentation.DaggerApplicationComponent

public class XtockApplication : BaseApplication() {


    override fun applicationInjector(): AndroidInjector<out dagger.android.DaggerApplication> {
        return DaggerApplicationComponent.builder().create(this)
    }

}