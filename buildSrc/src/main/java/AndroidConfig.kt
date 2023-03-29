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
        const val kotlingradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val serializationGradlePlugin = "org.jetbrains.kotlin:kotlin-serialization:$version"
    }

    object Dagger {
        private const val version = "2.42"
        const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object Compose {
        private const val version = "1.2.0"
        const val composeGradlePlugin = "androidx.compose.ui:ui:$version"
        const val composeActivityGradlePlugin = "androidx.activity:activity-compose:1.5.1"
        const val composeMaterialGradlePlugin = "androidx.compose.material:material:$version"
        const val composeMaterialIconGradlePlugin = "androidx.compose.material:material-icons-extended:$version"
        const val composeToolingPreviewGradlePlugin = "androidx.compose.ui:ui-tooling-preview:$version"
        const val composeTextJunitGradlePlugin = "androidx.compose.ui:ui-test-junit4:$version"
        const val composeToolingGradlePlugin = "androidx.compose.ui:ui-tooling:$version"
        const val composeTestManifestGradlePlugin = "androidx.compose.ui:ui-test-manifest:$version"
    }




}