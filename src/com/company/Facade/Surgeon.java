package com.company.Facade;

public class Surgeon extends Doctor{
    @Override
    public String name() {
        return "Surgeon";
    }

    @Override
    public String treat() {
        return "cutting people";
    }
}
