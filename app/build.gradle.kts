plugins {
    id(BuildPlugins.Properties.APPLICATION)
    id(BuildPlugins.Properties.ANDROID)
}

android {
    namespace = ProjectProperties.NAMESPACE
    compileSdk = ProjectProperties.COMPILE_SDK

    defaultConfig {
        applicationId = ProjectProperties.NAMESPACE
        minSdk = ProjectProperties.MIN_SDK
        targetSdk = ProjectProperties.TARGET_SEK
        versionCode = ProjectProperties.Version.VERSION_CODE
        versionName = ProjectProperties.Version.VERSION_NAME

        testInstrumentationRunner = ProjectProperties.Test.RUNNER
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ProjectProperties.KOTLIN_COMPILER_EXTENSION_VERSION
    }
    packagingOptions {
        resources {
            excludes += ProjectProperties.RESOURCE_EXCLUDES
        }
    }
}

dependencies {

    implementation(Dependencies.AndroidX.CORE)
    implementation(Dependencies.AndroidX.APPCOMPAT)
    implementation(Dependencies.Google.MATERIAL)
    implementation(Dependencies.AndroidX.LIFECYCLE)
    implementation(Dependencies.AndroidX.ACTIVITY_COMPOSE)
    implementation(Dependencies.Compose.UI)
    implementation(Dependencies.Compose.PREVIEW)
    implementation(Dependencies.Compose.MATERIAL)
    testImplementation(Dependencies.Junit.JUNIT)
    androidTestImplementation(Dependencies.Junit.EXT)
    androidTestImplementation(Dependencies.Espresso.ESPRESSO)
    androidTestImplementation(Dependencies.Compose.JUNIT)
    debugImplementation(Dependencies.Compose.TOOLING)
    debugImplementation(Dependencies.Compose.MANIFEST)
}