package com.company.AbstractFactory;

public class DeluxeVisitFactory implements VisitFactory {
    @Override
    public RequestType getRequestType() {
        return new TimeRequestType();
    }

    @Override
    public DoctorType getDoctorType() {
        return new DeluxeDoctorType();
    }
}
