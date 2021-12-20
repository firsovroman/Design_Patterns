package com.firsov.design_patterns.the_behavioral_Command;

public class InsertCommand implements Command{

    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
