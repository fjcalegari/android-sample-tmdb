plugins {
    id(BuildPlugins.androidLibrary)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        minSdkVersion(AndroidSdk.min)
    }
}

dependencies {

    implementation(Libraries.navFrag)
    implementation(Libraries.navUi)

}