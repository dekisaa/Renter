

plugins {
	id("org.springframework.boot") version "2.3.0.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	id("java-library")
	id("com.diffplug.gradle.spotless") version "3.27.1"
}

group = "com.potfolio"
version = "0.0.1-SNAPSHOT"

apply("$rootDir/gradle/openapi.gradle.kts")

spotless {
	java {
		removeUnusedImports()
		googleJavaFormat()
	}
}

sourceSets["main"].java {
	srcDir("src\\generated\\java")
}

repositories {
	mavenCentral()
	jcenter()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.3.4.RELEASE")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("jakarta.validation:jakarta.validation-api:2.0.2")
	implementation("mysql:mysql-connector-java:8.0.21")
	implementation("org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:2.3.4.RELEASE")

	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("io.swagger:swagger-annotations:1.6.2")
	implementation("org.openapitools:jackson-databind-nullable:0.2.1")
}

//configurations {
//	implementation {
//		exclude(group = "org.codehaus.jackson") // old jackson1
//	}
//}
