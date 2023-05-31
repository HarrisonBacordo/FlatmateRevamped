package com.harrisonbacordo.flatmate.ui

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.harrisonbacordo.flatmate.ui.auth.AuthFlow
import com.harrisonbacordo.flatmate.ui.home.HomeFlow
import com.harrisonbacordo.flatmate.ui.onboarding.OnboardingFlow
import com.harrisonbacordo.flatmate.ui.theme.FlatMateHomeTheme
import com.harrisonbacordo.flatmate.ui.theme.FlatmateAuthTheme
import com.harrisonbacordo.flatmate.ui.theme.FlatmateOnboardingTheme

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun FlatmateEntryPoint() {
    val navController = rememberNavController()
    val authRoute: (userId: String) -> Unit = { createNavRoute(navController, Destination.Auth, "/$it") }
    val homeRoute: (userId: String) -> Unit = { createNavRoute(navController, Destination.Home, "/$it") }
    NavHost(navController = navController, startDestination = Destination.Auth.name) {
        composable(Destination.Auth.name) {
            FlatmateAuthTheme {
                AuthFlow()
            }
        }
        composable(Destination.Onboarding.name.plus("/{userId}")) {
            FlatmateOnboardingTheme {
                val userId = it.arguments?.getSerializable("userId", String::class.java)
                OnboardingFlow()
            }
        }
        composable(Destination.Home.name.plus("/{userId}")) {
            FlatMateHomeTheme {
                val userId = it.arguments?.getSerializable("userId", String::class.java)
                HomeFlow()
            }
        }

    }
}

/**
 * Executes app-wide navigation to [destination] via [navController]. Clears the backstack
 * to ensure that the application closes if back is pressed from the root of any flow.
 *
 * @param navController [NavController] to navigate with
 * @param destination Destination that identifies the route
 */
private fun createNavRoute(navController: NavController, destination: Destination, argument: String? = null) {
    navController.popBackStack()
    var route = destination.name
    argument?.let {
        route = route.plus(argument)
    }
    navController.navigate(route)
}

enum class Destination {
    Auth,
    Onboarding,
    Home,
}