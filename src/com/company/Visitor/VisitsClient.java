package com.company.Visitor;

public class VisitsClient {
    public static void main(String[] args) {
        Visitable[] listOfDoctors = new Visitable[]{
                new Therapist("Ivan", 50),
                new Surgeon("Ivan", 120, false),
                new Surgeon("Vasil", 150, true)};
        int total = calculatePrice(listOfDoctors);
        System.out.print("Total price for all of the doctors is : ");
        System.out.println(total);
    }

    private static int calculatePrice(Visitable[] listOfDoctors) {
        Visitor visitor = new Patient();
        int sum = 0;
        for (Visitable doctor : listOfDoctors) {
            sum += doctor.accept(visitor);
        }
        return sum;
    }


}

