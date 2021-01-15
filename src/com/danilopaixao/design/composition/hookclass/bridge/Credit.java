package com.danilopaixao.design.composition.hookclass.bridge;

import java.math.BigDecimal;

public class Credit implements Transaction {

    private final BigDecimal value;

    public Credit(BigDecimal value){
        this.value = value;
    }

    @Override
    public void makeTransaction() {
        System.out.println("Bridge to Credit transaction");
    }

}
