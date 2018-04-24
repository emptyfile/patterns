package com.company.ChainOfResponsibility;

public class Traumatologist extends Doctor{
    public Traumatologist(Doctor next) {
        super(next);
    }

    @Override
    public void treat(Visit visit) {
        if (visit.getDisease().equals(Disease.BROKEN_ARM)) {
            print(visit);
            visit.setTreated(true);
        } else
            super.treat(visit);
    }

        @Override
    public String toString() {
        return "Traumatologist";
    }
}
