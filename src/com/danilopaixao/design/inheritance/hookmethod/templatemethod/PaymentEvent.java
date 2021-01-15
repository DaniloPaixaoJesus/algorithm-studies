package com.danilopaixao.design.inheritance.hookmethod.templatemethod;

public class PaymentEvent extends Event{

    protected void methodA(){
        super.methodA();
        System.out.println("Method A executed from PaymentEvent");
    }

    @Override
    protected void methodB() {
        super.methodC();
        System.out.println("Method B executed from PaymentEvent");
    }

}
