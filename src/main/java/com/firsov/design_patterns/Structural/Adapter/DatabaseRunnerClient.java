package com.firsov.design_patterns.Structural.Adapter;

public class DatabaseRunnerClient {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();

    }

}
