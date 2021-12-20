package com.firsov.design_patterns.structural_Adapter;

public class DatabaseRunnerClient {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();

    }

}
