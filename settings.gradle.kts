pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(url = "https://maven.google.com")
        maven(url = "https://jitpack.io")
        jcenter()
        google()
        mavenCentral()

    }
}
rootProject.name = "composeinandroid"
include (":app" )
include(":core:presentation")
include(":core:domain")
include(":core:data")
