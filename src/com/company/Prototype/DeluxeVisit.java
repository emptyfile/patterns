package com.company.Prototype;

import java.time.LocalDate;

public class DeluxeVisit extends Visit {
    private String visitTime;

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public DeluxeVisit(String doctorName, String doctorsOffice, String visitTime) {
        super(doctorName, doctorsOffice);
        this.visitTime = visitTime;
    }

    @Override
    public String toString() {
        return "DeluxeVisit:" +
                "visitTime='" + visitTime + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", doctorsOffice='" + doctorsOffice + '\'';
    }

    @Override
    public void getInfo() {
        System.out.println(this.toString());
    }
}
