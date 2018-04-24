package com.company.Prototype;

import java.time.LocalDate;

public class Registry {
    public static void main(String[] args) {
        DeluxeVisit deluxeVisit =
                new DeluxeVisit("Vatson", "209", "19:20");
        DeluxeVisit clonedVisit = null;
        try {
            clonedVisit = (DeluxeVisit) deluxeVisit.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return;
        }
        clonedVisit.setVisitTime("20:00");
        deluxeVisit.getInfo();
        clonedVisit.getInfo();


    }
}
