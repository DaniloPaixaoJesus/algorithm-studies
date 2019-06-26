package com.danilopaixao.design.strategy;

import java.math.BigDecimal;

public class ICMS implements Tax{

    private final BigDecimal tax = new BigDecimal(0.1);

    private BigDecimal value;

    public ICMS(BigDecimal value){
        this.value = value;
    }

    @Override
    public BigDecimal calculateValue() {
        return value.multiply(tax);
    }

}
