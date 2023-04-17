include(":conventions")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    versionCatalogs.register("libsPlugins") {
        from(files("../gradle/libs.versions.toml"))
    }
}
