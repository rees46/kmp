package com.rees46.generator.tasks.compose

import com.rees46.generator.compose.ComposeModuleGenerator
import com.rees46.generator.tasks.BaseGeneratorTask
import org.gradle.api.tasks.TaskAction

abstract class GenerateComposeModuleTask : BaseGeneratorTask() {

    init {
        group = "generator"
        description = "Generates a new Compose module"
    }

    @TaskAction
    fun generate() {
        ComposeModuleGenerator(
            project = project,
            moduleName = moduleName.get(),
            organization = organization.get()
        ).generate()
    }
}
