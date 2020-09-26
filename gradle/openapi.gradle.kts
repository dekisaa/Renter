import org.openapitools.generator.gradle.plugin.OpenApiGeneratorPlugin
import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.openapitools:openapi-generator-gradle-plugin:4.2.3")
    }
}

apply<OpenApiGeneratorPlugin>()


val generateApi by tasks.creating(GenerateTask::class) {
    group = "api"
    generatorName.set("spring")
    inputSpec.set("$rootDir/specs/openapi.yml")
    outputDir.set("$rootDir")
    apiPackage.set("com.portfolio.renter.api")
    modelPackage.set("com.portfolio.renter.api.model")
    invokerPackage.set("com.portfolio.renter")
    generateApiTests.set(false)
    configOptions.set(
            mapOf(
                    "interfaceOnly" to "true",
                    "skipDefaultInterface" to "true",
                    "hideGenerationTimestamp" to "true",
                    "bigDecimalAsString" to "true",
                    "sourceFolder" to "src/generated/java",
                    "useTags" to "true"
            )
    )
    doFirst {
        delete(fileTree("$rootDir\\src\\generated\\java\\com\\portfolio\\renter\\api").matching {
            include("**/*")
        })
    }
    finalizedBy("spotlessApply")

    doLast {
        delete("$rootDir\\src\\generated\\java\\com\\portfolio\\renter\\api\\ApiUtil.java")
        delete("$rootDir\\pom.xml")
    }
}

//tasks.named("check") {
//    dependsOn(generateApi)
//}

tasks.named("openApiGenerate") {
    enabled = false
}
