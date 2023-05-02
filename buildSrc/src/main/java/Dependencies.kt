object Dependencies {

    object AndroidX {
        const val CORE = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.ANDRODIX_APPCOMPAT}"
        const val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ANDROIDX_LIFECYCLE}"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ANDROIDX_ACTIVITY_COMPOSE}"
    }

    object Room {
        const val RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    }

    object Google {
        const val MATERIAL = "com.google.android.material:material:${Versions.GOOGLE_METERIAL}"
    }

    object Compose {
        const val UI = "androidx.compose.ui:ui:${Versions.COMPOSE_UI}"
        const val PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE_UI}"
        const val MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE_UI}"
        const val JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE_UI}"
        const val TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE_UI}"
        const val MANIFEST = "androidx.compose.ui:ui-test-manifest:${Versions.COMPOSE_UI}"
    }

    object Junit {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val EXT = "androidx.test.ext:junit:${Versions.JUNIT_EXT}"
    }

    object Espresso {
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
    }

    object Xerial {
        const val JDBC = "org.xerial:sqlite-jdbc:${Versions.JDBC}"
    }

    object Okhttp {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    }
}