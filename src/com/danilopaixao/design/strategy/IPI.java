package com.danilopaixao.design.strategy;

import java.math.BigDecimal;

public class IPI  implements Tax{

    private final BigDecimal tax = new BigDecimal(0.2);

    private BigDecimal value;

    public IPI(BigDecimal value){
        this.value = value;
    }

    @Override
    public BigDecimal calculateValue() {
        return value.multiply(tax);
    }

}