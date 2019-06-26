package com.danilopaixao.design.templatemethod.hookmethod;

abstract public class Event {

    public final void execute(){
        methodA();
        methodB();
        methodC();
    }

    protected void methodA(){
        System.out.println("Method A executed from Event");
    };

    abstract protected void methodB();

    final protected void methodC(){
        System.out.println("Immutable Method C executed");
    }

}
