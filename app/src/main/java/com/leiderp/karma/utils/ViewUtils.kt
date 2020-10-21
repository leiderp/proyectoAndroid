package com.leiderp.karma.utils

import android.content.Context
import android.content.Intent
import com.leiderp.karma.ui.Login
import com.leiderp.karma.ui.Singup
import com.leiderp.karma.ui.home
import com.leiderp.karma.ui.profileHelp

fun Context.startHomeActivity() =
    Intent(this, profileHelp::class.java).also {
        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(it)
    }

fun Context.startLoginActivity() =
    Intent(this, Login::class.java).also {
        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(it)
    }
