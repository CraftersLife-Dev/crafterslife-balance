plugins {
    id("java")
    id("com.gradleup.shadow") version "9.0.0-rc1"
    id("xyz.jpenilla.resource-factory-paper-convention") version "1.3.0"
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
}

paperPluginYaml {
    main = "io.github.crafters_dev.crafterslifebalance.CraftersLifeBalance"
    bootstrapper = "io.github.crafters_dev.crafterslifebalance.CraftersLifeBalanceBootstrap"
    version = "1.0.0-SNAPSHOT"
    author = ""
    apiVersion = "1.21"
}

tasks {
    runServer {
        minecraftVersion("1.21.4")
        downloadPlugins {
//            modrinth("luckperms", "v5.5.9-bukkit")
        }
    }

    shadowJar {
        archiveClassifier = null as String?
    }
}
