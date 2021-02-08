package com.danilopaixao.design.encapsulation.adapter;

public interface SenderSMS {
    public void sendMessage(String destiny, String origin, String[] msgs)
            throws SMSException;
}