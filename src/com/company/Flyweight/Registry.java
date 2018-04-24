package com.company.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<DoctorsOffice, ITreat> doctors;

    public Registry() {
        doctors = new HashMap<>();
    }

    public ITreat createVisit(DoctorsOffice doctorsOffice) {
        ITreat doctor = doctors.get(doctorsOffice);
        if (doctor == null) {
            switch (doctorsOffice) {
                case C340:
                    doctor = new Surgeon();
                    doctors.put(doctorsOffice, doctor);
                    break;
                case C322:
                    doctor = new Dantist();
                    doctors.put(doctorsOffice, doctor);
                    break;
                case C420:
                    doctor = new Therapis();
                    doctors.put(doctorsOffice, doctor);
                    break;
                default:
                    break;
            }

        }
        return doctor;
    }


}
