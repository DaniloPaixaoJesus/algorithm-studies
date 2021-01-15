package com.danilopaixao.design.composition.hookclass.bridge;

import java.math.BigDecimal;

public class Debit implements Transaction {

    private final BigDecimal value;

    public Debit(BigDecimal value){
        this.value = value;
    }

    @Override
    public void makeTransaction() {
        System.out.println("Bridge to Debit transaction");
    }

}
