group = "${rootProject.group}.${rootProject.name}"
version = rootProject.version

repositories {
    mavenCentral()
    maven("https://central.sonatype.com/repository/maven-snapshots/")
}