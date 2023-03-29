object Version {
    const val compileSdk = 33
    const val minSdk = 23
    const val targetSdk = 33
    const val versionCode = 1000000
    const val versionName = "1.0.0"
}

object Dep {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.3.0"

    object Kotlin {
        const val version = "1.6.20"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val serializationGradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:$version"
    }

    object Dagger {
        private const val version = "2.42"
        const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object Compose {
        private const val version = "1.2.0"
        const val composeGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

}