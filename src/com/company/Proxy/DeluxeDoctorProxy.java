package com.company.Proxy;

public class DeluxeDoctorProxy implements IDoctor {
    private static final int NUM_PATIENTS_ALLOWED = 5;
    private int numPatients;

    private final IDoctor doctor;

    public DeluxeDoctorProxy(IDoctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void treat(Patient patient) {
        if (numPatients<NUM_PATIENTS_ALLOWED){
            doctor.treat(patient);
            numPatients++;
        }else {
            System.out.println(patient + " is not allowed to enter today.");
        }
    }
}
