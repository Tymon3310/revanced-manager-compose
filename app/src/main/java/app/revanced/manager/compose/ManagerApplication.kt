package app.revanced.manager.compose

import android.app.Application
import app.revanced.manager.compose.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ManagerApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@ManagerApplication)
            modules(
                httpModule,
                preferencesModule,
                repositoryModule,
                serviceModule,
            )
        }
    }
}