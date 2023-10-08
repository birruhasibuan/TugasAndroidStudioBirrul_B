package com.example.tugasbirrul1

import kotlinx.parcelize.Parcelize

@Parcelize

data class User(
    val username: String,
    val password: String
):Parcelize
