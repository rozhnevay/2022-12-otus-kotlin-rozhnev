rootProject.name = "otus-kotlin-rozhnev"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false}
}


include("m1-init")