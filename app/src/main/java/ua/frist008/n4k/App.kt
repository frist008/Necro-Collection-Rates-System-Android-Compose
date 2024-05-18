package ua.frist008.n4k

import com.google.firebase.Firebase
import com.google.firebase.crashlytics.crashlytics
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import ua.frist008.n4k.util.logger.CrashlyticsTree
import ua.frist008.n4k.util.logger.TagDebugTree
import android.app.Application as AndroidApplication

@HiltAndroidApp class App : AndroidApplication() {

    override fun onCreate() {
        super.onCreate()

        setupTimber()
        initFirebase()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(CrashlyticsTree(), TagDebugTree())
        } else {
            Timber.plant(CrashlyticsTree())
        }

        Timber.i("Application.onCreate")
    }

    private fun initFirebase() {
        Firebase.crashlytics.setCrashlyticsCollectionEnabled(!BuildConfig.DEBUG)
        Firebase.crashlytics.setCustomKey("DEBUG", BuildConfig.DEBUG)
    }
}
