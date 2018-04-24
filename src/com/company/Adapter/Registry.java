package com.company.Adapter;

public class Registry {
    private IPayable visit;

    public Registry(IPayable visit) {
        this.visit = visit;
    }

    public IPayable getVisit() {
        return visit;
    }

    public void setVisit(IPayable visit) {
        this.visit = visit;
    }

    public void getPaymentInfo(){
        visit.pay();
    }
}
