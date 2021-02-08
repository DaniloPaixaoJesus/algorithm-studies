package com.danilopaixao.design.encapsulation.adapter;


public class SMS {
    private String destiny;
    private String origin;
    private String text;

    public SMS(String destiny, String origin, String text) {
        this.destiny = destiny;
        this.origin = origin;
        this.text = text;
    }

    public String getDestiny() {
        return destiny;
    }

    public String getOrigin() {
    return origin;
    }

    public String getText() {
    return text;
    }
}