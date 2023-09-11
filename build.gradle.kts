plugins {
    id("java")
}

group = "leave.meet"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // springframework basic
    implementation("org.springframework:spring-aop:6.0.11")
    implementation("org.springframework:spring-tx:6.0.11")
    implementation("org.springframework:spring-web:6.0.11")
    implementation("org.springframework:spring-core:6.0.11")
    implementation("org.springframework:spring-expression:6.0.11")
    implementation("org.springframework:spring-beans:6.0.11")
    implementation("org.springframework:spring-context:6.0.11")
    implementation("org.springframework:spring-websocket:6.0.11")
    implementation("org.springframework:spring-test:6.0.11")
    implementation("org.springframework:spring-webmvc:6.0.11")
    //implementation("org.springframework.security:spring-security-web:6.1.2")

    // thymeleaf
    implementation("org.thymeleaf:thymeleaf-spring5:3.1.1.RELEASE")
    implementation("nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect:3.2.1")
    implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6:3.1.1.RELEASE")

    // logging
    implementation("org.apache.logging.log4j:log4j:3.0.0-alpha1")
    implementation("org.apache.logging.log4j:log4j-api:3.0.0-alpha1")
    implementation("org.apache.logging.log4j:log4j-core:3.0.0-alpha1")

    // json
    implementation("org.json:json:20230618")
    implementation("com.google.code.gson:gson:2.10.1")

    // jwt
    implementation("io.jsonwebtoken:jjwt-root:0.11.5")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}