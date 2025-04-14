package com.rees46.generator.tasks.kmp

import com.rees46.generator.kmp.KmpModuleGenerator
import com.rees46.generator.tasks.BaseGeneratorTask
import org.gradle.api.tasks.TaskAction

abstract class GenerateKmpModuleTask : BaseGeneratorTask() {

    init {
        group = "generator"
        description = "Generates a new KMP module"
    }

    @TaskAction
    fun generate() {
        KmpModuleGenerator(
            project = project,
            moduleName = moduleName.get(),
            organization = organization.get()
        ).generate()
    }
}
