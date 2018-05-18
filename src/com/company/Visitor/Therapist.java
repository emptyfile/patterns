package com.company.Visitor;

public class Therapist implements Visitable {
    private String name;
    private int visitPrice;

    public Therapist(String name, int visitPrice) {
        this.name = name;
        this.visitPrice = visitPrice;
    }

    public String getName() {
        return name;
    }

    public int getVisitPrice() {
        return visitPrice;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
