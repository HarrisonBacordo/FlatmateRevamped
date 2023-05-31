package com.harrisonbacordo.flatmate.ui.auth.landing

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.assisted.Assisted
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * [ViewModel] associated with [AuthLanding]
 */
@HiltViewModel
class AuthLandingViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    /**
     *
     */
    fun attemptLoginWithFacebook() {
    }

    /**
     *
     */
    fun attemptLoginWithGoogle() {
    }
}
