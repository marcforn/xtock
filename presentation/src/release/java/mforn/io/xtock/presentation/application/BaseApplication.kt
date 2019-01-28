package mforn.io.xtock.presentation.application

import android.app.Application
import com.facebook.stetho.Stetho
import com.squareup.leakcanary.LeakCanary
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

abstract class BaseApplication : DaggerApplication(), AnkoLogger {}