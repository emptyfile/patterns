package com.company.Adapter;

public class FreeVisitAdapter implements IPayable{
    private FreeVisit freeVisit;
    @Override
    public void pay() {
        System.out.println("Client " + freeVisit.getName() +" payed 0");
    }

    public FreeVisitAdapter(FreeVisit freeVisit) {
        this.freeVisit = freeVisit;
    }
}
