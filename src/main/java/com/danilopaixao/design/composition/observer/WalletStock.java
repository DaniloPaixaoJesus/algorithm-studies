package com.danilopaixao.design.composition.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletStock {

    private Map<String,Integer> stocks = new HashMap<>();

    private List<StockObserver> observables = new ArrayList<>();

    public void addObservable(StockObserver o) {
        observables.add(o);
    }

    public void addStock(String stock, Integer quantity) {
        if(stocks.containsKey(stock)){
            quantity += stocks.get(stock);
        }
        this.stocks.put(stock, quantity);

        notifyObservers(stock, quantity);
    }

    private void notifyObservers(String stockName, Integer quantity) {
        observables.stream().forEach(o -> o.update(stockName, quantity));
    }

}
