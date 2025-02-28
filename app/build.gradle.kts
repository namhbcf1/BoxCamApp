plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" // 🔹 Đảm bảo đã có dòng này
}



android {
    namespace = "com.example.boxcamapp" // ⚡ Đặt namespace theo package của bạn

    compileSdk = 34 // Cập nhật lên phiên bản mới nhất
    defaultConfig {
        applicationId = "com.example.boxcamp"
        minSdk = 26
        targetSdk = 34 // Đồng bộ với compileSdk
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "2.0.0" // Đảm bảo đúng phiên bản
    }
}


dependencies {

    implementation("androidx.core:core-ktx:1.12.0") // Cập nhật mới nhất
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Jetpack Compose (phiên bản mới nhất)
    implementation("androidx.compose.ui:ui:1.6.0") // 🆕 Cập nhật phiên bản mới nhất
    implementation("androidx.compose.material:material:1.6.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.6.0")

    // 🔹 Thêm Compose Compiler
    implementation("androidx.compose.compiler:compiler:2.0.0")
}


