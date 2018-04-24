package com.company.ChainOfResponsibility;

public class Therapist extends Doctor {
    public Therapist(Doctor next) {
        super(next);
    }

    @Override
    public void treat(Visit visit) {
        if (visit.getDisease().equals(Disease.SICK_THROAT)){
            print(visit);
            visit.setTreated(true);
        }else
        super.treat(visit);
    }

    @Override
    public String toString() {
        return "Therapist";
    }
}
