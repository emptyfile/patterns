package com.company.Facade;

import java.util.List;

public class ClinicFacade {
    private final List<Doctor> doctors;

    public ClinicFacade(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void startNewWorkDay(){
        for (Doctor doc : doctors) {
            doc.startWorkDay();
        }
    }

    public void endWorkDay(){
        for (Doctor doc : doctors) {
            doc.endWorkDay();
        }
    }
}
