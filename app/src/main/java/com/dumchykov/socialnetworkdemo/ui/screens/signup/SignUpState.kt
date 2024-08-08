package com.dumchykov.socialnetworkdemo.ui.screens.signup

data class SignUpState(
    val email: String = "",
    val emailError: Boolean = false,
    val emailIsFocused: Boolean = false,
    val password: String = "",
    val passwordError: Boolean = false,
    val passwordIsFocused: Boolean = false,
    val rememberMe: Boolean = true,
    val autoLogin: Boolean = false,
)