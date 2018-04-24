package com.company.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Visit visit1 = new Visit(10);
        Visit visit2 = new Visit(15);
        Visit visit3 = new Visit(20);
        Visit visit4 = new Visit(25);
        Doctor doctor1 = new Doctor(Arrays.asList(visit1, visit2));
        Doctor doctor2 = new Doctor(Arrays.asList(visit3, visit4));
        Department department = new Department((Arrays.asList(doctor1, doctor2)));
        System.out.println(department.getAllPayments());


    }
}
