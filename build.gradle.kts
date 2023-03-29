// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        jcenter()
        google()

    }

    dependencies {
        classpath(Dep.androidGradlePlugin)
        classpath(Dep.Kotlin.gradlePlugin)
        classpath(Dep.Kotlin.serializationGradlePlugin)

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
