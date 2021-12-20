package com.firsov.design_patterns.Generative.Prototype;

public class Client {

    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");
        System.out.println(master);

//        Project masterClone = (Project) master.copy();
//        System.out.println("\n==================\n");
//        System.out.println(masterClone);


        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("\n==================\n");
        System.out.println(masterClone);


    }

}
