plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    // dagger hilt
//    id("kotlin-kapt")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")

    //lombok
    kotlin("plugin.lombok")
    id("io.freefair.lombok")
}
apply(from = "../gradle/dependencies_group.gradle")

android {
    namespace = "fr.test.solera.repository"
    compileSdk = 35

    defaultConfig {
        minSdk = 30

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = "21"
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

//    addHilt()
//    addLombok()

//
//    implementation("com.google.dagger:hilt-android:2.51.1")
//    ksp("com.google.dagger:hilt-android-compiler:2.51.1")
//
//    compileOnly("org.projectlombok:lombok:1.18.38")
//    annotationProcessor("org.projectlombok:lombok:1.18.38")
}