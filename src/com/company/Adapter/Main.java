package com.company.Adapter;

public class Main {
    public static void main(String[] args) {
        DeluxeVisit deluxeVisit = new DeluxeVisit("Vasya", "Andrey",20);
        Registry registry = new Registry(deluxeVisit);
        registry.getPaymentInfo();

        FreeVisit freeVisit = new FreeVisit("Igor", "Igor");
        registry = new Registry(new FreeVisitAdapter(freeVisit));
        registry.getPaymentInfo();
    }
}
