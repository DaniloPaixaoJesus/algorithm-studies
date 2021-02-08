package com.danilopaixao.design.composition.hookclass.strategy;

import java.math.BigDecimal;
import java.util.List;

class IndustryProduct extends Product{

    public IndustryProduct(List<Tax> taxes, BigDecimal value){
        super(taxes, value);
    }

    @Override
    public BigDecimal getFinalValue(){
        BigDecimal totalTax = BigDecimal.ZERO;
        for(Tax t: getTaxes()){
            BigDecimal augend = t.calculateValue(getValue());
            totalTax = totalTax.add(augend);
        }
        return getValue().add(totalTax);
    }

}
