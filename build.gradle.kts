plugins {
    java
    scala
//    id("com.github.maiflai.scalatest") version "0.33"
}

tasks.withType<ScalaCompile>().configureEach {
    scalaCompileOptions.additionalParameters = listOf(
        "-Xunchecked-java-output-version",
        JavaVersion.current().majorVersion,
    )
}

repositories {
    mavenCentral()
}

dependencies {
    val scalaVersion = "3.8.3"
    val (scalaMinor, _) = requireNotNull(Regex("^(\\d+)(\\.\\d+)(\\.\\d+)?$").matchEntire(scalaVersion)).destructured
    // https://mvnrepository.com/artifact/org.scala-lang/scala3-library
    implementation("org.scala-lang:scala3-library_3:${scalaVersion}")
    testImplementation("org.scalatest:scalatest_$scalaMinor:3.2.12")
    testRuntimeOnly("com.vladsch.flexmark:flexmark-all:0.64.8")
    testImplementation("org.junit.jupiter:junit-jupiter-api:6.0.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:6.0.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
