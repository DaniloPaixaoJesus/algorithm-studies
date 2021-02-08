package com.danilopaixao.design.composition.hookclass.strategy;

import java.math.BigDecimal;

public class IPI  implements Tax{

    private final BigDecimal tax = new BigDecimal(0.2);

    @Override
    public BigDecimal calculateValue(BigDecimal value) {
        return value.multiply(tax);
    }

}