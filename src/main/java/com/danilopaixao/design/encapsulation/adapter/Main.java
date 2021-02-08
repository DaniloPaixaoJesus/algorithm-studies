package com.danilopaixao.design.encapsulation.adapter;

public class Main {

    public static void main(String[] args) throws Exception{

        SenderSMS OldSender = null;
        OldSender.sendMessage("", "", new String[]{"",""});

        SenderSMSAdapter senderSmsAdapter = new SenderSMSAdapter(OldSender);
        SMS sms = new SMS("", "", "");
        senderSmsAdapter.sendSMS(sms);
    }
}
