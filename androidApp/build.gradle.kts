plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "uz.ayizor.armusic.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "uz.ayizor.armusic.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    val nav_version = "2.5.2"
    val lifecycler_version = "2.5.1"
    val exo_player_version = "2.18.1"
    //coil
    implementation("io.coil-kt:coil-compose:2.0.0-rc01")
    //exo player
    implementation("com.google.android.exoplayer:exoplayer:$exo_player_version")
    implementation("com.google.android.exoplayer:exoplayer-core:$exo_player_version")
    implementation("com.google.android.exoplayer:exoplayer-dash:$exo_player_version")
    implementation("com.google.android.exoplayer:exoplayer-ui:$exo_player_version")

    //Glide
    implementation("com.github.bumptech.glide:glide:4.14.2")
    annotationProcessor("com.github.bumptech.glide:compiler:4.14.2")
//life cycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycler_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycler_version")
    //navigation
    implementation("androidx.navigation:navigation-compose:$nav_version")
    //navigation
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    //
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.2.1")
    implementation("androidx.compose.ui:ui-tooling:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.compose.foundation:foundation:1.2.1")
    implementation("androidx.compose.material:material:1.2.1")
    implementation("androidx.activity:activity-compose:1.6.0")
}