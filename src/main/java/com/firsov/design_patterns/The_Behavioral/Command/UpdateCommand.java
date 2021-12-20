package com.firsov.design_patterns.The_Behavioral.Command;

public class UpdateCommand implements Command{
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
