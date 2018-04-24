package com.company.Adapter;

public class DeluxeVisit extends Visit implements IPayable {
    private int price;

    @Override
    public void pay() {
        System.out.println("Client " + this.getName() + " payed "  + price);
    }

    public DeluxeVisit(int price) {
        this.price = price;
    }

    public DeluxeVisit(String name, String doctor, int price) {
        super(name, doctor);
        this.price = price;
    }

    public DeluxeVisit() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
