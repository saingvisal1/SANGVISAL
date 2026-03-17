plugins {
    kotlin("jvm") version "1.9.23"
}

group = "academy.stepit"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Coroutines — required for Day 6 (suspend, launch, delay, runBlocking)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
}

kotlin {
    jvmToolchain(17)
}

// Allow each file with a main() to be run individually via IntelliJ
// Right-click any .kt file → Run 'FileNameKt'
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "17"
    }
}
