plugins {
    id(BuildPlugins.Properties.LIBRARY)
    id(BuildPlugins.Properties.ANDROID)
}

android {
    namespace = ProjectProperties.PRESENTATION
    compileSdk = ProjectProperties.COMPILE_SDK

    defaultConfig {
        minSdk = ProjectProperties.MIN_SDK
        targetSdk = ProjectProperties.TARGET_SDK

        testInstrumentationRunner = ProjectProperties.Test.RUNNER
        consumerProguardFiles(ProjectProperties.Files.CONSUMER_PROGUARDFILES)
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProjectProperties.Files.DEFAULT_PROGUARDFILES),
                ProjectProperties.Files.PROGUARDFILES
            )
        }
    }
    compileOptions {
        sourceCompatibility = ProjectProperties.JAVA_VERSION
        targetCompatibility = ProjectProperties.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = ProjectProperties.JVM_TARGET
    }
}

dependencies {

    implementation(Dependencies.Google.MATERIAL)
    implementation(Dependencies.AndroidX.LIFECYCLE)
    implementation(Dependencies.AndroidX.ACTIVITY_COMPOSE)
    implementation(Dependencies.Compose.UI)
    implementation(Dependencies.Compose.PREVIEW)
    implementation(Dependencies.Compose.MATERIAL)
    implementation(Dependencies.AndroidX.CORE)
    implementation(Dependencies.AndroidX.APPCOMPAT)
    implementation(Dependencies.Google.MATERIAL)
    testImplementation(Dependencies.Junit.JUNIT)
    androidTestImplementation(Dependencies.Junit.EXT)
    androidTestImplementation(Dependencies.Espresso.ESPRESSO)
}