package com.danilopaixao.design.composition.hookclass.bridge;

abstract public class Event {

    protected Transaction transaction;

    public Event(Transaction transaction){
        this.transaction = transaction;
    }
}
