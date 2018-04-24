package com.company.ChainOfResponsibility;

public class Surgeon extends Doctor {
    public Surgeon(Doctor next) {
        super(next);
    }

    @Override
    public void treat(Visit visit) {
        if (visit.getDisease().equals(Disease.APPENDIX)) {
            print(visit);
            visit.setTreated(true);
        } else
            super.treat(visit);
    }

    @Override
    public String toString() {
        return "Surgeon";
    }
}
