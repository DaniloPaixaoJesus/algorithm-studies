package com.danilopaixao.design.inheritance.hookmethod.templatemethod;

public class ReceivementEvent extends Event{

    protected void methodA(){
        super.methodA();
        System.out.println("Method A executed from ReceivementEvent");
    };

    @Override
    protected void methodB() {
        System.out.println("Method B executed from ReceivementEvent");
    }

}
