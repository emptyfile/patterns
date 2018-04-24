package com.company.AbstractFactory;

public class FactoryMaker {
    public static VisitFactory makeFactory(String visitType){
        switch (visitType){
            case "Common Visit":{
                return new CommonVisitFactory();
            }
            case "Deluxe Visit":{
                return new DeluxeVisitFactory();
            }
            default:{
                throw new IllegalArgumentException("Unknown type of visit");
            }
        }
    }
}
