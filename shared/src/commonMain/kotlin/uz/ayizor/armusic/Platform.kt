package uz.ayizor.armusic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform