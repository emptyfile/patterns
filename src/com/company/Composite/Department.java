package com.company.Composite;

import java.util.List;

public class Department extends TreatingBuisenessNode {
    public Department(List<Doctor> doctors){
        doctors.forEach(this::add);
    }

    @Override
    public int getPayment() {
        return list.stream().mapToInt(TreatingBuisenessNode::getPayment).sum();
    }
}
