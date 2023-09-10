plugins {
    id("java")
}

group = "leave.meet"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-aop:6.0.11")
    implementation("org.springframework:spring-tx:6.0.11")
    implementation("org.springframework:spring-web:6.0.11")
    implementation("org.springframework:spring-core:6.0.11")
    implementation("org.springframework:spring-expression:6.0.11")
    implementation("org.springframework:spring-beans:6.0.11")
    implementation("org.springframework:spring-context:6.0.11")
    implementation("org.springframework:spring-websocket:6.0.11")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}