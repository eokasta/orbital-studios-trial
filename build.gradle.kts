plugins {
    id("java")
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
}

group = "me.eokasta.orbitalstudios"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.19-R0.1-SNAPSHOT")

    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    compileOnly("org.jetbrains:annotations:23.0.0")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    sourceCompatibility = "17"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

bukkit {
    name = "orbital-studios-trial"
    apiVersion = "1.19"
    version = "${project.version}"
    author = "EoKasta"
    website = "https://github.com/eokasta/"
    main = "me.eokasta.orbitalstudios.trial.Main"

    commands {
        register("fire")
        register("lightning")
        register("explode")
    }
}