package com.company.Visitor;

public class Patient implements Visitor {
    @Override
    public int visit(Therapist therapist) {
        int cost = 0;
        cost = therapist.getVisitPrice();
        return cost;
    }

    @Override
    public int visit(Surgeon surgeon) {
        int cost = 0;
        if (surgeon.isAvards()) {
            cost = surgeon.getVisitPrice() + 50;
        } else cost = surgeon.getVisitPrice();
        return cost;
    }
}
