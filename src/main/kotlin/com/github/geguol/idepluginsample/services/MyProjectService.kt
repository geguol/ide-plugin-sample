package com.github.geguol.idepluginsample.services

import com.intellij.openapi.project.Project
import com.github.geguol.idepluginsample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
