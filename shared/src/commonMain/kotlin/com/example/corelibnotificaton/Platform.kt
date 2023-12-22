package com.example.corelibnotificaton

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform