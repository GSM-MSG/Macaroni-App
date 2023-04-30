import org.gradle.api.JavaVersion

object ProjectProperties {

    val NAMESPACE = "com.msg.macaroniapp"

    val COMPILE_SDK = 33
    val MIN_SDK = 31
    val TARGET_SEK = 33

    val JAVA_VERSION = JavaVersion.VERSION_1_8

    val JVM_TARGET = "1.8"

    val KOTLIN_COMPILER_EXTENSION_VERSION = "1.2.0"

    val RESOURCE_EXCLUDES = "/META-INF/{AL2.0,LGPL2.1}"

    object Version {
        val VERSION_CODE = 1
        val VERSION_NAME = "1.0.0"
    }

    object Test {
        val RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Files {
        const val CONSUMER_PROGUARDFILES = "consumer-rules.pro"
        const val DEFAULT_PROGUARDFILES = "proguard-android-optimize.txt"
        const val PROGUARDFILES = "proguard-rules.pro"
    }
}