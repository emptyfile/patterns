package com.company.Mediator;

public class Main {
    public static void main(String[] args) {
        Doctorgram doctorgram = new Doctorgram();
        Doctor ivan = new Therapist(doctorgram);
        Doctor vasya = new Surgeon(doctorgram);
        doctorgram.add(ivan);
        doctorgram.add(vasya);
        ivan.send("Patient needs a surgery", vasya);
        vasya.send("Preparing the O.R.", ivan);
    }
}
