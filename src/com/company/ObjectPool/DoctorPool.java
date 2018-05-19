package com.company.ObjectPool;

public class DoctorPool extends ObjectPool<Doctor> {
    @Override
    protected Doctor create() {
        return new Doctor();
    }
}
