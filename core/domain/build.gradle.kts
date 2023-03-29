plugins {
    id("com.android.application")
    id("kotlin-android")

}

android {
    namespace = "com.example.composeinandroid.core.domain"
    compileSdk = Version.compileSdk
    defaultConfig {
        applicationId = "com.example.composeinandroid.core.domain"
        minSdk = Version.minSdk
        targetSdk = Version.targetSdk
        versionCode = Version.versionCode
        versionName = Version.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

}

dependencies {
//    implementation(project(":core:data"))
//    implementation(project(":core:presentation"))

    implementation(Dep.androidGradlePlugin)
    implementation(Dep.Kotlin.kotlingradlePlugin)
    implementation(Dep.Kotlin.serializationGradlePlugin)


}