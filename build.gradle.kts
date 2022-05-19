plugins {
    id("org.asciidoctor.jvm.convert") version "3.3.2"
}

repositories {
    mavenCentral()
}

tasks.asciidoctor {
    baseDirFollowsSourceFile()
    sourceDir("${project.projectDir}/src/docs")
    sources {
        include("security.adoc")
    }
}

tasks.build.configure {
    dependsOn(tasks.asciidoctor)
}



