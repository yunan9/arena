plugins {
    id("arena.java-library-conventions")
    id("arena.maven-publishing-conventions")
}

dependencies {
    api(platform(libs.guice.bom))
    api(libs.bundles.guice)

    api(libs.yunan9.commons)
    api(libs.jetbrains.annotations)
}