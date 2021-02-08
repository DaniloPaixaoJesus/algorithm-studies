package com.danilopaixao.design.encapsulation.proxy;

public class ProxyAssincrono implements Transacao {
    private Transacao t;

    public ProxyAssincrono(Transacao t) {
        this.t = t;
    }

    public void executar() {
        Runnable r = new Runnable() {
            public void run() {
                t.executar();
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}