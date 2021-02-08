package com.danilopaixao.design.composition.hookclass.bridge;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PurchaseEvent purchaseEvent = new PurchaseEvent(new Debit(BigDecimal.ONE));
        purchaseEvent.buy();

        SellEvent sellEvent = new SellEvent(new Credit(BigDecimal.ONE));
        sellEvent.sell();

    }

}
