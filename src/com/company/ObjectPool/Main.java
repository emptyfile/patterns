package com.company.ObjectPool;

public class Main {
    public static void main(String[] args) {
        DoctorPool doctorPool = new DoctorPool();
        System.out.println(doctorPool.toString());
        Doctor doctor1 = doctorPool.checkOut();
        System.out.println("Checked out " + doctor1);
        System.out.println(doctorPool.toString());
        Doctor doctor2 = doctorPool.checkOut();
        System.out.println("Checked out " + doctor2);
        Doctor doctor3 = doctorPool.checkOut();
        System.out.println("Checked out " +  doctor3);
        System.out.println(doctorPool.toString());
        System.out.println("Checking in "+ doctor1);
        doctorPool.checkIn(doctor1);
        System.out.println("Checking in " + doctor2);
        doctorPool.checkIn(doctor2);
        System.out.println(doctorPool.toString());
        Doctor doctor4 = doctorPool.checkOut();
        System.out.println("Checked out " + doctor4);
        Doctor doctor5 = doctorPool.checkOut();
        System.out.println("Checked out " + doctor5);
        System.out.println(doctorPool.toString());
    }
}
