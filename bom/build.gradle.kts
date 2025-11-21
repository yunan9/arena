plugins {
    `java-platform`
}

dependencies {
    constraints {
        sequenceOf(
            ":core"
        ).forEach(::api)
    }
}