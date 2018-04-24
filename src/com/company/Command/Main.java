package com.company.Command;

public class Main {
    public static void main(String[] args) {
        Doctor surgent = new Doctor();

        StartNewDay startNewDay = new StartNewDay(surgent);
        Inspect inspect = new Inspect(surgent);
        Surgery surgery = new Surgery(surgent);
        EndWorkDay endWorkDay = new EndWorkDay(surgent);

        WorkDay workDay = new WorkDay();

        workDay.takeAction(startNewDay);
        workDay.takeAction(inspect);
        workDay.takeAction(inspect);
        workDay.takeAction(inspect);
        workDay.takeAction(surgery);
        workDay.takeAction(endWorkDay);
        workDay.makeActions();
    }
}
