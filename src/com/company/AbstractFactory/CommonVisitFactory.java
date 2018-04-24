package com.company.AbstractFactory;


public class CommonVisitFactory implements VisitFactory {
    @Override
    public RequestType getRequestType() {
        return new CommonRequestType();
    }

    @Override
    public DoctorType getDoctorType() {
      return  new CommonDoctorType();
    }
}
