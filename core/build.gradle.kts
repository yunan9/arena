plugins {
    id("arena.java-library-conventions")
    id("arena.maven-publishing-conventions")
}

dependencies {
    api(platform(libs.guice.bom))
    api(libs.bundles.guice)

    api(libs.bundles.yunan9.series)

    api(libs.jetbrains.annotations)
}