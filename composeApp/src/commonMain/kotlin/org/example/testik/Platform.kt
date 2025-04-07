package org.example.testik

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform