package com.firsov.design_patterns.The_Behavioral.Command;

public class ClientDatabaseRunner {

    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(new InsertCommand(database), new UpdateCommand(database), new SelectCommand(database), new DeleteCommand(database));

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();

    }

}
