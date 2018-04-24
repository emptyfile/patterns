package com.company.Bridge;

public class Main {
    public static void main(String[] args) {
        (new FreeVisit(new Dentist())).visitDoctor();
        (new FreeVisit(new Surgeon())).visitDoctor();
        (new DeluxeVisit(new Dentist())).visitDoctor();
        (new DeluxeVisit(new Surgeon())).visitDoctor();
    }
}
