package com.rees46.generator.compose

import com.rees46.generator.core.ModuleGenerator
import org.gradle.api.Project

class ComposeModuleGenerator(
    project: Project,
    moduleName: String,
    organization: String
) : ModuleGenerator(project, moduleName, organization) {
    override val gradleTemplatePath = "templates/compose/compose.build.gradle.kts.template"
    override val kotlinTemplatePath = "templates/compose/ComposeBaseFile.kt.template"
}
