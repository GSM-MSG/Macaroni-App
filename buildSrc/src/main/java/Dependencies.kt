object Dependencies {

    object AndroidX {
        val CORE = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
        val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.ANDRODIX_APPCOMPAT}"
        val LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ANDROIDX_LIFECYCLE}"
        val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:${Versions.ANDROIDX_ACTIVITY_COMPOSE}"
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
}