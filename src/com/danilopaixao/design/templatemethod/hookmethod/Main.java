package com.danilopaixao.design.templatemethod.hookmethod;

public class Main {

    public static void main(String[] args) {
        Event event1 = new PaymentEvent();
        event1.execute();
        System.out.println("--------------");
        Event event2 = new ReceivementEvent();
        event2.execute();
    }

}
