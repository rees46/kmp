package com.rees46.generator.kmp

import com.rees46.generator.core.ModuleGenerator
import org.gradle.api.Project

class KmpModuleGenerator(
    project: Project,
    moduleName: String,
    organization: String
) : ModuleGenerator(project, moduleName, organization) {
    override val gradleTemplatePath = "templates/kmp/kmp.build.gradle.kts.template"
    override val kotlinTemplatePath = "templates/kmp/KmpBaseFile.kt.template"
}
