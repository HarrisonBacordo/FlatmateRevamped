package com.harrisonbacordo.flatmate.ui.auth.continueWIthEmail

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

@Composable
fun AuthContinueWithEmail() {
    val viewModel: AuthContinueWithEmailViewModel =
        ViewModelProvider(LocalContext.current as ViewModelStoreOwner)[AuthContinueWithEmailViewModel::class.java]
    AuthContinueWithEmailScreen()

}

@Composable
private fun AuthContinueWithEmailScreen() {

}