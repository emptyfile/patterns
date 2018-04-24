package com.company.Prototype;

import java.util.Date;

public abstract class Visit implements Cloneable {
    protected String doctorName;
    protected String doctorsOffice;

    public Visit() {
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorsOffice() {
        return doctorsOffice;
    }

    public void setDoctorsOffice(String doctorsOffice) {
        this.doctorsOffice = doctorsOffice;
    }

    public Visit(String doctorName, String doctorsOffice) {
        this.doctorName = doctorName;
        this.doctorsOffice = doctorsOffice;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Visit:" +
                "doctorName='" + doctorName + '\'' +
                ", doctorsOffice='" + doctorsOffice + '\'';
    }

    public abstract void getInfo();
}
