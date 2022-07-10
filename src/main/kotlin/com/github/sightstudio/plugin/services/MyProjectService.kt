package com.github.sightstudio.plugin.services

import com.intellij.openapi.project.Project
import com.github.sightstudio.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
