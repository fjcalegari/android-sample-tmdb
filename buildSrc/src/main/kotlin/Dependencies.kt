const val kotlinVersion = "1.3.60"

object BuildPlugins {
    object Versions {
        const val androidBuildToolsVersion = "3.5.2"
        const val androidNavSafeArgsVersion = "2.1.0"
    }

    const val applicationId = "com.fjcalegari.tmdb"

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidBuildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidNavSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidNavSafeArgsVersion}"

    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
    const val androidNavPlugin = "androidx.navigation.safeargs.kotlin"
}

object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = compile
    const val buildToolsVersion = "29.0.2"
}

object ProjectModules {
    const val app = ":app"
    const val navigation = ":navigation"
    const val ui_home = ":ui-home"
    const val ui_discover = ":ui-discover"
}

object Libraries {
    private object Versions {
        const val jetpack = "1.1.0"
        const val constraintLayout = "1.1.3"
        const val ktx = "1.1.0"
        const val lifecycle = "2.1.0"
        const val material = "1.0.0"
        const val nav = "2.1.0-rc01"
    }

    const val kotlinStdLib8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val material = "com.google.android.material:material:${Versions.material}"

    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"

    const val navFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    const val navUi = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
}