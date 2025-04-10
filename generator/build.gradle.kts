plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

group = "com.rees46"
version = "1.0.0"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

gradlePlugin {
    plugins {
        create("moduleGenerator") {
            id = "com.rees46.module-generator"
            implementationClass = "com.rees46.generator.ModuleGeneratorPlugin"
        }
    }
}

sourceSets.main {
    resources.srcDirs("src/main/resources")
}

tasks.withType<ProcessResources>().configureEach {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
