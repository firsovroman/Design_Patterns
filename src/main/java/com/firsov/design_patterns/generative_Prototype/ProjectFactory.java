package com.firsov.design_patterns.generative_Prototype;

public class ProjectFactory {
    Copybale project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }

}
