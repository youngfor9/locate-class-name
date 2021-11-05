package com.github.youngfor9.locateclassname.services

import com.intellij.openapi.project.Project
import com.github.youngfor9.locateclassname.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
