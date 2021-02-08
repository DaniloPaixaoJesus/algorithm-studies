package com.danilopaixao.design.composition.hookclass.strategy;

import java.math.BigDecimal;

public class ICMS implements Tax{

    private final BigDecimal tax = new BigDecimal(0.1);

    @Override
    public BigDecimal calculateValue(BigDecimal value) {
        return value.multiply(tax);
    }

}
