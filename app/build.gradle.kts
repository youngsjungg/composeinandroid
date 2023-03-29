plugins {
    id ("com.android.application")
    id ("kotlin-android")

}

android {
    namespace = "com.example.composeinandroid"
    compileSdk = Version.compileSdk


    defaultConfig {
        applicationId = "com.example.composeinandroid"
        minSdk = Version.minSdk
        versionCode = Version.versionCode
        versionName =  Version.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =  true
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose =  true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
dependencies {

    implementation ("androidx.core:core-ktx:1.8.0")
    implementation( "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    implementation(Dep.Compose.composeGradlePlugin)
    implementation(Dep.Compose.composeActivityGradlePlugin)
    implementation(Dep.Compose.composeToolingPreviewGradlePlugin)
    implementation(Dep.Compose.composeMaterialGradlePlugin)
    implementation(Dep.Compose.composeMaterialIconGradlePlugin)
    androidTestImplementation (Dep.Compose.composeTextJunitGradlePlugin)
    debugImplementation( Dep.Compose.composeToolingGradlePlugin)
    debugImplementation( Dep.Compose.composeTestManifestGradlePlugin)


}