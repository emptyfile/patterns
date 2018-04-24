package com.company.Iterator;

public class Main {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Ivan");
        Doctor doc2 = new Doctor("Igor");
        Doctor doc3 = new Doctor("Vasya");

        DoctorsList doctors= new DoctorsList();
        doctors.add(doc1);
        doctors.add(doc2);
        doctors.add(doc3);
        doctors.forEach(x -> System.out.println(x.name));
        
    }
}
