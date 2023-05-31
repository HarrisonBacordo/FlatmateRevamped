package com.harrisonbacordo.flatmate.ui.auth.createNewAccount

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthCreateNewAccountViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

}