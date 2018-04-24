package com.company.ChainOfResponsibility;

import com.company.AbstractFactory.DoctorType;

public class Visit {

    private final Disease disease;
    private final String description;
    private boolean treated;

    public Visit(Disease disease, String description) {
        this.disease = disease;
        this.description = description;
    }

    public Disease getDisease() {
        return disease;
    }

    public String getDescription() {
        return description;
    }

    public boolean isTreated() {
        return treated;
    }

    public void setTreated(boolean treated) {
        this.treated = treated;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "description='" + description + '\'' +
                '}';
    }
}

enum Disease {
    BROKEN_ARM,
    SICK_THROAT,
    APPENDIX
}
