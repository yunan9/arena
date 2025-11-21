plugins {
    id("arena.maven-publishing-conventions")
    `java-platform`
}

dependencies {
    constraints {
        sequenceOf(
            ":core"
        ).forEach(::api)
    }
}