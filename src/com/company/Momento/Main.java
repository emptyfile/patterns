package com.company.Momento;

public class Main {
    public static void main(String[] args) {
        PrivateClinicSystem  clinic = new PrivateClinicSystem();
        clinic.setConfig("start", "running", "connect MyDB");
        RollbackPoint point = clinic.createRollbackPoint();
        System.out.println(clinic.toString());
        clinic.setConfig("start1", "running1", "connect NoDB");
        System.out.println(clinic.toString());
        clinic.rollback(point);
        System.out.println(clinic.toString());
    }
}
