package com.harrisonbacordo.flatmate.ui.auth.continueWIthEmail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthContinueWithEmailViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel() {
}