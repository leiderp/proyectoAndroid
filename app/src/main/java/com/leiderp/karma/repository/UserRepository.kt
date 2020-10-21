package com.leiderp.karma.repository

import com.leiderp.karma.data.firebaseSource

class UserRepository(private val firebase: firebaseSource) {
    fun login(email: String, password: String) = firebase.login(email, password)

    fun register(email: String, password: String) = firebase.register(email, password)

    fun currentUser() = firebase.currentUser()

    fun logout() = firebase.logout()
}