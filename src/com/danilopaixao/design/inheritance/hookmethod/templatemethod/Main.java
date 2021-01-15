package com.danilopaixao.design.inheritance.hookmethod.templatemethod;

public class Main {

    public static void main(String[] args) {
        Event event1 = new PaymentEvent();
        event1.execute();
        System.out.println("--------------");
        Event event2 = new ReceivementEvent();
        event2.execute();
    }

}
