package com.leiderp.karma

import android.app.Application
import android.system.Os.bind
import com.leiderp.karma.data.firebaseSource
import com.leiderp.karma.repository.UserRepository
import com.leiderp.karma.viewModel.AuthViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class FirebaseApplication: Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@FirebaseApplication))

        bind() from singleton { firebaseSource() }
        bind() from singleton { UserRepository(instance()) }
        bind() from provider { AuthViewModelFactory(instance()) }
        //bind() from provider { HomeViewModelFactory(instance()) }

    }
}