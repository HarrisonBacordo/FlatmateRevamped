@file:OptIn(ExperimentalMaterial3Api::class)

package com.harrisonbacordo.flatmate.ui.auth.landing

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.harrisonbacordo.flatmate.R
import com.harrisonbacordo.flatmate.ui.auth.AuthOnboardingScreenOption
import com.harrisonbacordo.flatmate.ui.auth.CompanyLogo
import com.harrisonbacordo.flatmate.ui.theme.FlatmateAuthTheme
import com.harrisonbacordo.flatmate.ui.theme.facebookBlue

@Composable
fun AuthLanding(onCreateNewAccountClicked: () -> Unit, ) {
    val viewModel: AuthLandingViewModel = ViewModelProvider(LocalContext.current as ViewModelStoreOwner)[AuthLandingViewModel::class.java]
    AuthLandingScreen()
}

/**
 * High-level component that displays the auth landing screen
 */
@Composable
private fun AuthLandingScreen(
) {
    CompanyLogo(modifier = Modifier.clickable(onClick = {}))
    Column(
        Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        AuthOnboardingScreenOption(
            title = "Create New Account",
            leadingIcon = R.drawable.ic_sign_up_24dp,
            modifier = Modifier.clickable(onClick = {})
        )
        AuthOnboardingScreenOption(
            title = "Continue With Email",
            leadingIcon = R.drawable.ic_email_24dp,
            modifier = Modifier.clickable(onClick = {})
        )
        AuthOnboardingScreenOption(
            title = "Continue With Facebook",
            leadingIcon = R.drawable.ic_email_24dp,
            Modifier
                .background(facebookBlue)
                .clickable(onClick = {})
        )
        AuthOnboardingScreenOption(
            title = "Continue With Google",
            leadingIcon = R.drawable.ic_email_24dp,
            modifier = Modifier
                .background(Color.White)
                .clickable(onClick = {}),
            contentColor = Color.Black
        )
    }
}

@Preview(name = "Auth Landing Theme")
@Composable
private fun AuthLandingScreenPreview() {
    FlatmateAuthTheme {
        Scaffold {
            it
            AuthLandingScreen()
        }
    }
}

@Preview(name = "Auth Screen Option")
@Composable
private fun AuthScreenOptionPreview() {
    FlatmateAuthTheme {
        Surface(modifier = Modifier.background(color = MaterialTheme.colorScheme.primary)) {
            AuthOnboardingScreenOption(
                title = "Create New Account",
                leadingIcon = R.drawable.ic_sign_up_24dp,
            )
        }
    }
}