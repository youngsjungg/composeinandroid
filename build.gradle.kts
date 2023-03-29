// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val compose_ui_version by extra("1.2.0")
    repositories {
        mavenCentral()
        jcenter()
        google()

    }

    dependencies {
        classpath(Dep.androidGradlePlugin)
        classpath(Dep.Kotlin.kotlingradlePlugin)
        classpath(Dep.Kotlin.serializationGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")

    }
}
allprojects {
    repositories {



    }
}
task("clean", Delete::class) {
    delete = setOf(rootProject.buildDir)
}

//subprojects {
//    afterEvaluate {
//        project.apply("$rootDir/gradle/common.gradle")
//    }
//}
