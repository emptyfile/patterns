package com.company.ChainOfResponsibility;

public abstract class Doctor {
    private Doctor next;

    public Doctor(Doctor next) {
        this.next = next;
    }

    public void treat(Visit visit){
        if(next!=null){
            next.treat(visit);
        }
    }

    protected void print(Visit visit){
        System.out.println(this + " treating " + visit.getDescription());
    }

    @Override
    public abstract String toString();
}
