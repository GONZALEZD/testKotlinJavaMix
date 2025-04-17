plugins {
    alias(libs.plugins.android.application)
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
    namespace = "fr.test.solera.testmixjavakotlin"
    compileSdk = 35

    defaultConfig {
        applicationId = "fr.test.solera.testmixjavakotlin"
        minSdk = 30
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = "21"
    }

    viewBinding {
        enable = true
    }
}

dependencies {

    api(project(path = ":repository"))

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.legacy.support.v4)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.fragment.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("com.google.dagger:hilt-android:2.51.1")
    ksp("com.google.dagger:hilt-android-compiler:2.51.1")

    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
}


//// Allow references to generated code
//kapt {
//    correctErrorTypes = true
//    keepJavacAnnotationProcessors = true
//}