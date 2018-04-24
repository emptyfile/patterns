package com.company.Decorator;

public class Main {
    public static void main(String[] args) {
        Doctor vanya = new SimpeDoctor();
        System.out.println(vanya.treat());
        System.out.println(vanya.getDoctorsPrice());
        System.out.println(vanya.getDoctorsSalary());

        DeluxeDoctor doc = new DeluxeDoctor(vanya);
        System.out.println(doc.treat());
        System.out.println(doc.getDoctorsPrice());
        System.out.println(doc.getDoctorsSalary());

    }
}
