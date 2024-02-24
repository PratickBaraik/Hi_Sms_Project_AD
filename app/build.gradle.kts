plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // adding the google services plugin
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.hisms"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.hisms"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth-ktx:22.3.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.airbnb.android:lottie:6.3.0")

    // adding firebase bom dependency
    implementation(platform("com.google.firebase:firebase-bom:32.7.2"))

    // adding firebase analytics dependency
    implementation("com.google.firebase:firebase-analytics")

    // adding authentication dependency for registration
    implementation("com.google.firebase:firebase-auth")
}