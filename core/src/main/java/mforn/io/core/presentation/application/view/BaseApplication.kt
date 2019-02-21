package mforn.io.core.presentation.application.view

import com.facebook.stetho.Stetho
import com.squareup.leakcanary.LeakCanary
import dagger.android.DaggerApplication
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

// TODO mforn: 2/21/19 move to release package
abstract class BaseApplication : DaggerApplication(), AnkoLogger {


    override fun onCreate() {
        super.onCreate()

        initializeStetho()
        initializeLeakCanary()
    }

    private fun initializeStetho() {
        val initializerBuilder = Stetho.newInitializerBuilder(this)

        // Enable Chrome DevTools
        initializerBuilder.enableWebKitInspector(
            Stetho.defaultInspectorModulesProvider(this)
        )

        // Enable command line interface
        initializerBuilder.enableDumpapp(
            Stetho.defaultDumperPluginsProvider(this)
        )

        // Use the InitializerBuilder to generate an Initializer
        val initializer = initializerBuilder.build()

        // Initialize Stetho with the Initializer
        Stetho.initialize(initializer)
        info("Stetho initialized")
    }

    private fun initializeLeakCanary() {
        LeakCanary.install(this)
        info("LeakCanary initialized")
    }
}