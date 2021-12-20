package com.firsov.design_patterns.Structural.Bridge;


public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs = {
                new BankSystemProgram(new JavaDeveloper()),     //можно поменять на другого разработчика
                new StockExchangeProgram(new CppDeveloper())    // можно поменять на другого разработчика
        };

        for(Program program: programs) {
            program.developProgram();
        }

    }
}
