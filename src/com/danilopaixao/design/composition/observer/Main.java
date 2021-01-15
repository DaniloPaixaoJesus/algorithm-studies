package com.danilopaixao.design.composition.observer;

public class Main {

    public static void main(String[] args) throws Exception {
        StockGraphic graphic = new StockGraphic();
        StockLogger logger = new StockLogger();

        WalletStock main = new WalletStock();
        main.addObservable(graphic);
        main.addObservable(logger);

        Thread.sleep(2000);
        main.addStock("COMP02", 200);

        Thread.sleep(2000);
        main.addStock("EMP34", 400);

        Thread.sleep(2000);
        main.addStock("ACDF89", 300);

        Thread.sleep(2000);
        main.addStock("EMP34", -200);

        Thread.sleep(2000);
        main.addStock("COMP02", 150);
    }

}
