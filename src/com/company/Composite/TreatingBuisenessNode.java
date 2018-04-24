package com.company.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class TreatingBuisenessNode {
    List<TreatingBuisenessNode> list = new ArrayList<>();
    public void add(TreatingBuisenessNode node){
        list.add(node);
    }

    public int getAllPayments(){
        return list.stream().mapToInt(TreatingBuisenessNode::getPayment).sum();
    }

    public abstract int getPayment();
}
