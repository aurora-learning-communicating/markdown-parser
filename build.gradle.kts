plugins {
    kotlin("jvm") version "2.1.20"
    antlr
}

group = "com.aurora.markdown"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.antlr/antlr4
    antlr("org.antlr:antlr4:4.13.2")
    // https://mvnrepository.com/artifact/org.antlr/antlr4-runtime
    implementation("org.antlr:antlr4-runtime:4.13.2")
    testImplementation(kotlin("test"))
}

sourceSets {
    main {
        antlr {
            setSrcDirs(listOf("grammar"))
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

val grammarOutput = file("src/main/java/com/aurora/markdown/grammar")

tasks.generateGrammarSource {
    outputDirectory = grammarOutput
    arguments = arguments + listOf("-visitor", "-package", "com.aurora.markdown.grammar")

    doLast {
        val grammarDir = file("$projectDir/grammar")
        copy {
            from(outputDirectory) {
                include("*.tokens")
                include("*.interp")
            }

            into(grammarDir)
        }
    }


}

tasks.generateTestGrammarSource {
    outputDirectory = file("src/main/java/com/aurora/markdown/grammar")
    arguments = arguments + listOf("-visitor", "-package", "com.aurora.markdown.grammar")

    doLast {
        val grammarDir = file("$projectDir/grammar")
        copy {
            from(outputDirectory) {
                include("*.tokens")
                include("*.interp")
            }

            into(grammarDir)
        }
    }
}

tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
    dependsOn(tasks.generateTestGrammarSource)
}

tasks.compileTestKotlin {
    dependsOn(tasks.generateGrammarSource)
    dependsOn(tasks.generateTestGrammarSource)
}

tasks.compileJava {
    dependsOn(tasks.generateGrammarSource)
    dependsOn(tasks.generateTestGrammarSource)
}

tasks.compileTestJava {
    dependsOn(tasks.generateGrammarSource)
    dependsOn(tasks.generateTestGrammarSource)
}

kotlin {
    jvmToolchain(17)
}

tasks.register("antlr-clean") {
    val grammarDir = file("$projectDir/grammar")

    fileTree(grammarDir) {
        include("*.interp")
        include("*.tokens")
    }.let {
        delete(it)
    }

    fileTree(grammarOutput) {
        include("*.tokens")
        include("*.interp")
    }.let {
        delete(it)
    }
}