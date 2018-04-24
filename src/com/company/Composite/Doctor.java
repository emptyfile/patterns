package com.company.Composite;

import java.util.List;

public class Doctor extends TreatingBuisenessNode {
    public Doctor(List<Visit> visits){
        visits.forEach(this::add);
    }

    @Override
    public int getPayment() {
        return list.stream().mapToInt(TreatingBuisenessNode::getPayment).sum();
    }
}
