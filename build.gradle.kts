import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.8.21"
    kotlin("plugin.spring") version "1.8.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // https://mvnrepository.com/artifact/org.webjars/jquery
    implementation("org.webjars:jquery:3.6.4")

    // https://mvnrepository.com/artifact/org.webjars/bootstrap
    implementation("org.webjars:bootstrap:5.2.3")

    // https://mvnrepository.com/artifact/org.webjars/webjars-locator-core
    implementation("org.webjars:webjars-locator-core:0.52")

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-oauth2-client
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client:3.1.0")

    // https://mvnrepository.com/artifact/org.springframework.security.oauth/spring-security-oauth2
    implementation("org.springframework.security.oauth:spring-security-oauth2:2.5.2.RELEASE")

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools
    implementation("org.springframework.boot:spring-boot-devtools:3.1.0")

}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
