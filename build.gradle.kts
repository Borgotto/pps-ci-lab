plugins {
    java
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    // Java
    testImplementation(platform("org.junit:junit-bom:6.0.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Scala
    val scalaVersion = "3.3.7"
    val (scalaMinor, _) = requireNotNull(Regex("^(\\d+)(\\.\\d+)(\\.\\d+)?$").matchEntire(scalaVersion)).destructured
    implementation("org.scala-lang:scala3-library_3:${scalaVersion}")
}

// Enables JUnit Platform (needed for JUnit 5)
tasks.named<Test>("test") {
    useJUnitPlatform()
}

