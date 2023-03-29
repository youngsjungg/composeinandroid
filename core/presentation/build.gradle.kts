plugins {
    id("com.android.application")
    id("kotlin-android")

}

android {
    namespace = "com.example.data"
    compileSdk = Version.compileSdk
    defaultConfig {
        applicationId = "com.example.data"
        minSdk = Version.minSdk
        targetSdk = Version.targetSdk
        versionCode = Version.versionCode
        versionName = Version.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

}

dependencies {
    implementation(project(":core:domain"))
    implementation(project(":core:data"))

    implementation(Dep.androidGradlePlugin)
    implementation(Dep.Kotlin.kotlingradlePlugin)
    implementation(Dep.Kotlin.serializationGradlePlugin)
    implementation(Dep.Compose.composeGradlePlugin)
    implementation(Dep.Compose.composeToolingPreviewGradlePlugin)
    androidTestImplementation (Dep.Compose.composeTextJunitGradlePlugin)
    debugImplementation( Dep.Compose.composeToolingGradlePlugin)
    debugImplementation( Dep.Compose.composeTestManifestGradlePlugin)
}


