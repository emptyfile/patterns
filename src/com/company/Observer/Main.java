package com.company.Observer;

public class Main {
    public static void main(String[] args) {
        Doctor therapist = new Doctor();
        Patient vasya = new Patient("Vasya",therapist);
        Patient igor = new Patient("Igor",therapist);
        Patient andrew = new Patient("Andrew",therapist);
        therapist.setOnWork(false);
        therapist.setOnWork(true);
    }
}
