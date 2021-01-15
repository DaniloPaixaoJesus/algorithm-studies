package com.danilopaixao.design.composition.hookclass.strategy;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calculateValue(BigDecimal value);
}
