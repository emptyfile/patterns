package com.company.Proxy;

public class Main {
    public static void main(String[] args) {
        DeluxeDoctorProxy proxy = new DeluxeDoctorProxy(new Therapist());
        proxy.treat(new Patient("Vasya"));
        proxy.treat(new Patient("Igor"));
        proxy.treat(new Patient("Peter"));
        proxy.treat(new Patient("Andrew"));
        proxy.treat(new Patient("Rostik"));
        proxy.treat(new Patient("Stepan"));
        proxy.treat(new Patient("Vlad"));
    }
}
