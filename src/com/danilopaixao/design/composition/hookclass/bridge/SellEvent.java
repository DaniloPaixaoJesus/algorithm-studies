package com.danilopaixao.design.composition.hookclass.bridge;

class SellEvent extends Event {

    public SellEvent(Transaction transaction){
        super(transaction);
    }

    public void sell(){
        super.transaction.makeTransaction();
    }
}
