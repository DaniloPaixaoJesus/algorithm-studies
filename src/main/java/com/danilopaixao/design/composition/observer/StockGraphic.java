package com.danilopaixao.design.composition.observer;

public class StockGraphic implements StockObserver {

    public void update(String stockName, Integer quantity) {
        System.out.println("StockGraphic ## Action " + stockName + " quantity " + quantity);
    }
}
