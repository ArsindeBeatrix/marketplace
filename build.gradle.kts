plugins {
    kotlin("jvm") apply false
    application
}

group = "ru.otus"
version = "0.1"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version
}
