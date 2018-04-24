package com.company.Composite;

import java.util.List;

public class Visit extends TreatingBuisenessNode {
    private int visitPrice;

    public Visit(int visitPrice) {
        this.visitPrice = visitPrice;
    }

    @Override
    public int getPayment() {
        return visitPrice;
    }

}
