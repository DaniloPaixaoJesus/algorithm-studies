package com.danilopaixao.design.composition.hookclass.strategy;

import java.math.BigDecimal;
import java.util.List;

class ManufactureProduct extends Product{

    public ManufactureProduct(List<Tax> taxes, BigDecimal value){
        super(taxes, value);
    }

    @Override
    public BigDecimal getFinalValue(){
        BigDecimal totalTax = BigDecimal.ZERO;
        for(Tax t: getTaxes()){
            BigDecimal augend = t.calculateValue(getValue());
            totalTax = totalTax.add(augend).divide(new BigDecimal(2));
        }
        return getValue().add(totalTax);
    }

}
