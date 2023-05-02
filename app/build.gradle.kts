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
        targetSdk = ProjectProperties.TARGET_SDK
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
    implementation(project(ProjectProperties.Modules.PRESENTAION))
    implementation(project(ProjectProperties.Modules.DOMAIN))
    implementation(project(ProjectProperties.Modules.DATA))

    testImplementation(Dependencies.Junit.JUNIT)
    androidTestImplementation(Dependencies.Junit.EXT)
    androidTestImplementation(Dependencies.Espresso.ESPRESSO)
    androidTestImplementation(Dependencies.Compose.JUNIT)
    debugImplementation(Dependencies.Compose.TOOLING)
    debugImplementation(Dependencies.Compose.MANIFEST)
}