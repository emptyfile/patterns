package com.company.FactoryMethod;

public class VisitFactory {
    public static Visit createVisit(String visitType){
        switch (visitType){
            case "Common Visit":{
                return new CommonVisit();
            }
            case "Time Visit":{
                return new TimeVisit();
            }
            default:{
                throw  new IllegalArgumentException("Unknown type of visit");
            }

        }
    }
}
