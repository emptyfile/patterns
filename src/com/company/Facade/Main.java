package com.company.Facade;

        import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Surgeon surgeon1 = new Surgeon();
        Therapist therapist1 = new Therapist();
        Therapist therapist2 = new Therapist();
        ClinicFacade facade = new ClinicFacade(Arrays.asList(surgeon1,therapist1,therapist2));
        facade.startNewWorkDay();
        facade.endWorkDay();


    }

}
