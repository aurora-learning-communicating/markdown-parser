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

tasks.generateGrammarSource {
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
}

tasks.compileTestKotlin {
    dependsOn(tasks.generateGrammarSource)
    dependsOn(tasks.generateTestGrammarSource)
}

tasks.compileJava {
    dependsOn(tasks.generateGrammarSource)
}

tasks.compileTestJava {
    dependsOn(tasks.generateGrammarSource)
    dependsOn(tasks.generateTestGrammarSource)
}

kotlin {
    jvmToolchain(17)
}

tasks.register("rename-package") {

    doLast {
        val targetDir = File("/Users/steiner/workspace/aurora/markdown-parser/src/main/kotlin/com/aurora/markdown/core")

        modifyContentRecursive(targetDir)
    }
}

private fun modifyContent(file: File) {
    val lines = file.readLines().toMutableList()
    val replaceString = "com.steiner.aurora.com.aurora"
    val replacement = "com.aurora"
    lines.forEachIndexed { index, line ->
        if (line.contains(replaceString)) {
            lines[index] = line.replace(replaceString, replacement)
        }
    }

    // lines[0] = "package com.aurora.markdown.core.$packageName"

    file.writeText(lines.joinToString("\n"))
}

private fun modifyContentRecursive(directory: File) {
    directory.listFiles()?.forEach { file ->
        when {
            file.isFile -> {
                modifyContent(file)
            }

            file.isDirectory -> {
                modifyContentRecursive(file)
            }
        }
    }
}