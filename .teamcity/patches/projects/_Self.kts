package patches.projects

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    params {
        add {
            password("github_token", "credentialsJSON:9f222af8-aac9-40d6-8236-5a289ba34bb8", label = "github token", display = ParameterDisplay.HIDDEN)
        }
    }
}
