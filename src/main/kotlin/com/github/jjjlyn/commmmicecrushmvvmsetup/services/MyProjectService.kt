package com.github.jjjlyn.commmmicecrushmvvmsetup.services

import com.github.jjjlyn.commmmicecrushmvvmsetup.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
