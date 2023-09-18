buildscript {
    repositories {
        google() // Uncomment this line if needed
        jcenter()
        mavenCentral()
        mavenLocal()
    }
}
allprojects {
    repositories {
//        google() // Uncomment this line if needed
//        jcenter()
//        mavenCentral()
   //     mavenLocal()
    }
}
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
