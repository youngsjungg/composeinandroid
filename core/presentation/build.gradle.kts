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
    buildFeatures {
        compose =  true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }

}

dependencies {
//    implementation(project(":core:domain"))
//    implementation(project(":core:data"))

    implementation ("com.google.android.material:material:1.6.1")
    implementation ("androidx.activity:activity-compose:1.5.1")

    implementation(Dep.androidGradlePlugin)
    implementation(Dep.Kotlin.kotlingradlePlugin)
    implementation(Dep.Kotlin.serializationGradlePlugin)
    implementation(Dep.Compose.composeGradlePlugin)
    implementation(Dep.Compose.composeActivityGradlePlugin)
    implementation(Dep.Compose.composeToolingPreviewGradlePlugin)
    implementation(Dep.Compose.composeMaterialGradlePlugin)
    implementation(Dep.Compose.composeMaterialIconGradlePlugin)
    androidTestImplementation (Dep.Compose.composeTextJunitGradlePlugin)
    debugImplementation( Dep.Compose.composeToolingGradlePlugin)
    debugImplementation( Dep.Compose.composeTestManifestGradlePlugin)

}


