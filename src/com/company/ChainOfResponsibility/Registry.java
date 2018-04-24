package com.company.ChainOfResponsibility;

public class Registry {
    Doctor chain;

    public Registry() {
        buildChain();
    }

    private void buildChain() {
        chain = new Therapist(new Traumatologist(new Surgeon(null)));
    }

    public void makeVisit(Visit visit){
        chain.treat(visit);
    }
}
