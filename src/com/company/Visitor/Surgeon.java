package com.company.Visitor;

public class Surgeon implements Visitable {
    private String name;
    private int visitPrice;
    private boolean avards;

    public Surgeon(String name, int visitPrice, boolean avards) {
        this.name = name;
        this.visitPrice = visitPrice;
        this.avards = avards;
    }

    public String getName() {
        return name;
    }

    public int getVisitPrice() {
        return visitPrice;
    }

    public boolean isAvards() {
        return avards;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
