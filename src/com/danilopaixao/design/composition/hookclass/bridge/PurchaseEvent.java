package com.danilopaixao.design.composition.hookclass.bridge;

class PurchaseEvent extends Event {

    public PurchaseEvent(Transaction transaction){
        super(transaction);
    }

    public void buy(){
        super.transaction.makeTransaction();
    }

}
