package com.danilopaixao.design.composition.hookclass.strategy;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BigDecimal value = new BigDecimal(1000);
        List<Tax> taxes = List.of(new ICMS(), new IPI());

        IndustryProduct industryProduct = new IndustryProduct(taxes, value);
        ManufactureProduct manufactureProduct = new ManufactureProduct(taxes, value);

        System.out.println("IndustryProduct - Value with tax is $" + industryProduct.getFinalValue());
        System.out.println("ManufactureProduct - Value with tax is $" + manufactureProduct.getFinalValue());

    }

}
