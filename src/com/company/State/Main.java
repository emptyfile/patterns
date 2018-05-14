package com.company.State;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        Inspecting inspecting = new Inspecting();
        inspecting.action(doctor);
        System.out.println(doctor.getState().toString());

        NotWorking notWorking = new NotWorking();
        notWorking.action(doctor);
        System.out.println(doctor.getState().toString());

        OnDuty onDuty = new OnDuty();
        onDuty.action(doctor);
        System.out.println(doctor.getState().toString());
    }
}
