package com.company.Bridge;

public class FreeVisit extends Visit{
    public FreeVisit(IDoctor doctor) {
        super(doctor);
    }

    @Override
    public void visitDoctor() {
        System.out.println("This is free visit and doctor said: ");
        super.getDoctor().treat();
    }
}
