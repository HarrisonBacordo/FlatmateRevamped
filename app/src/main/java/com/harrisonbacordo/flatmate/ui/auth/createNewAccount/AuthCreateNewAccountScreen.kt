package com.harrisonbacordo.flatmate.ui.auth.createNewAccount

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner

@Composable
fun AuthCreateNewAccount() {
    val viewModel: AuthCreateNewAccountViewModel =
        ViewModelProvider(LocalContext.current as ViewModelStoreOwner)[AuthCreateNewAccountViewModel::class.java]
    AuthCreateNewAccountScreen()
}

@Composable
private fun AuthCreateNewAccountScreen() {

}