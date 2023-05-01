import org.gradle.api.JavaVersion

object ProjectProperties {

    const val NAMESPACE = "com.msg.macaroniapp"
    const val PRESENTATION = "com.msg.presentation"
    const val DOMAIN = "com.msg.domain"
    const val DATA = "com.msg.data"

    const val COMPILE_SDK = 33
    const val MIN_SDK = 31
    const val TARGET_SDK = 33

    val JAVA_VERSION = JavaVersion.VERSION_1_8

    const val JVM_TARGET = "1.8"

    const val KOTLIN_COMPILER_EXTENSION_VERSION = "1.2.0"

    const val RESOURCE_EXCLUDES = "/META-INF/{AL2.0,LGPL2.1}"

    object Version {
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0.0"
    }

    object Test {
        val RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Files {
        const val CONSUMER_PROGUARDFILES = "consumer-rules.pro"
        const val DEFAULT_PROGUARDFILES = "proguard-android-optimize.txt"
        const val PROGUARDFILES = "proguard-rules.pro"
    }

    object Modules {
        const val PRESENTAION = ":presentation"
        const val DOMAIN = ":domain"
        const val DATA = ":data"
    }
}