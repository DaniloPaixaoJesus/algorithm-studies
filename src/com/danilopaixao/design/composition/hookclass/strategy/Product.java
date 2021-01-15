package com.danilopaixao.design.composition.hookclass.strategy;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

abstract public class Product {
    private BigDecimal value;

    private List<Tax> taxes;

    protected BigDecimal getValue(){
        return value;
    }

    protected List<Tax> getTaxes() {
        return Collections.unmodifiableList(taxes);
    }

    public Product(List<Tax> taxes, BigDecimal value){
        this.taxes = taxes;
        this.value = value;
    }

    abstract protected BigDecimal getFinalValue();
}
