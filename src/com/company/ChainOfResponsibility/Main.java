package com.company.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        registry.makeVisit(new Visit(Disease.SICK_THROAT, "sick throat"));
        registry.makeVisit(new Visit(Disease.BROKEN_ARM, "broken arm"));
        registry.makeVisit(new Visit(Disease.APPENDIX, "appendix"));

    }
}
