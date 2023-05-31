package com.harrisonbacordo.flatmate.ui.auth

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.harrisonbacordo.flatmate.ui.auth.createNewAccount.AuthCreateNewAccountScreen
import com.harrisonbacordo.flatmate.ui.auth.debug.AuthDebugScreen
import com.harrisonbacordo.flatmate.ui.auth.forgotPassword.AuthForgotPasswordScreen
import com.harrisonbacordo.flatmate.ui.auth.landing.AuthLanding
import com.harrisonbacordo.flatmate.ui.auth.login.AuthLoginScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthFlow() {
    val authNavController = rememberNavController()
    val landingRoute = { executeNavRoute(navController = authNavController, route = AuthDestinations.Landing.name) }
    val createNewAccountRoute = { executeNavRoute(navController = authNavController, route = AuthDestinations.CreateNewAccount.name) }
    val loginRoute = { executeNavRoute(navController = authNavController, route = AuthDestinations.Login.name) }
    val forgotPasswordRoute = { executeNavRoute(navController = authNavController, route = AuthDestinations.ForgotPassword.name) }
    val debugRoute = { executeNavRoute(navController = authNavController, route = AuthDestinations.Debug.name) }
    Scaffold(
        content = {
            NavHost(modifier = Modifier.padding(it), navController = authNavController, startDestination = AuthDestinations.Landing.name) {
                composable(AuthDestinations.Landing.name) {
                    AuthLanding()
                }
                composable(AuthDestinations.CreateNewAccount.name) {
                    AuthCreateNewAccountScreen()
                }
                composable(AuthDestinations.Login.name) {
                    AuthLoginScreen()
                }
                composable(AuthDestinations.ForgotPassword.name) {
                    AuthForgotPasswordScreen()
                }
                composable(AuthDestinations.Debug.name) {
                    AuthDebugScreen()
                }
            }
        }
    )
}

/**
 * Executes auth-specific navigation to [route] via [navController]. Clears the backstack if [route] is [AuthDestinations.Landing]
 * to ensure that the application closes if back is pressed from there.
 *
 * @param navController [NavController] to navigate with
 * @param route [String] that identifies the route
 */
private fun executeNavRoute(navController: NavController, route: String) {
    if (route == AuthDestinations.Landing.name) {
        navController.popBackStack()
    }
    navController.navigate(route)
}

/**
 * Identifies the different destinations that can be reached from within [AuthFlow]
 */
enum class AuthDestinations {
    Landing,
    CreateNewAccount,
    Login,
    ForgotPassword,
    Debug,
}