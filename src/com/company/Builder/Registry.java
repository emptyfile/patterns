package com.company.Builder;

public class Registry {
    public static void main(String[] args) {
        DeluxeVisit rosticVisit = new DeluxeVisit.DeluxeVisitBuilder("Strange", "15:00")
                .addDoctorOffice(DoctorOffice.A207)
                .addMassage("back")
                .addProcedure("UZD")
                .build();

        DeluxeVisit andrewVisit = new DeluxeVisit.DeluxeVisitBuilder("Mengele", "8:00")
                .addDoctorOffice(DoctorOffice.A224)
                .build();

    }

}
