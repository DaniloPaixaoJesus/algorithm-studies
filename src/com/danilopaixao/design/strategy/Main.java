package com.danilopaixao.design.strategy;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BigDecimal valuePaid = new BigDecimal(1000);
        List<Tax> allTaxes = getAllTax(valuePaid);
        allTaxes.stream().forEach(t -> {
            System.out.println("Tax Value = " + t.calculateValue());
        });
    }

    public static List<Tax> getAllTax(BigDecimal value){
        return List.of(new ICMS(value), new IPI(value));
    }

}
