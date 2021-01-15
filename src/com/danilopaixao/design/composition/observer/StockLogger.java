package com.danilopaixao.design.composition.observer;

public class StockLogger implements StockObserver {

    public void update(String stockName, Integer quantity) {
        System.out.println("StockLogger ## Action " + stockName + " quantity " + quantity);
    }

}
