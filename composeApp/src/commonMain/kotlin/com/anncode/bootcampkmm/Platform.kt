package com.anncode.bootcampkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform