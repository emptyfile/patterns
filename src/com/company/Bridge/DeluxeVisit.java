package com.company.Bridge;

public class DeluxeVisit extends Visit {
    public DeluxeVisit(IDoctor doctor) {
        super(doctor);
    }

    @Override
    public void visitDoctor() {
        System.out.println("You payed for visit and doctor said: ");
        super.getDoctor().treat();
    }
}
