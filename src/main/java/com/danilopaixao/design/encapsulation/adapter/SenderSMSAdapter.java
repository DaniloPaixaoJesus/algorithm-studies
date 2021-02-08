package com.danilopaixao.design.encapsulation.adapter;

public class SenderSMSAdapter implements SMSSender {

    private SenderSMS env;

    public SenderSMSAdapter(SenderSMS env) {
        this.env = env;
    }

    public boolean sendSMS(SMS sms) {
        String destiny = sms.getDestiny();
        String origin = sms.getOrigin();
        String[] txts = brokesmns(sms.getText());
        try {
            env.sendMessage(destiny, origin, txts);
        } catch (SMSException e) {
            return false;
        }
        return true;
    }

    private String[] brokesmns(String text) {
        int size = text.length();
        int qtd = (size % 160 == 0) ? size / 160 : size / 160 + 1;
        String[] msgs = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            int min = i * 160;
            int max = (i == qtd - 1) ? size : (i + 1) * 160;
            msgs[i] = text.substring(min, max);
        }
        return msgs;
    }
}