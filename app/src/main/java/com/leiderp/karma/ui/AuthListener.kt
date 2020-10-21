package com.leiderp.karma.ui

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}