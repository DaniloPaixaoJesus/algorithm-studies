package com.danilopaixao.design.composition.recursion.chainofResponsibility;

public class Main {

    public static void main(String[] args) {
        FileRecover memo = new MemCacheRecover(null);
        FileRecover database = new DataBaseRecover(memo);
        FileRecover remoteServer = new DataBaseRecover(database);

        remoteServer.recover("lalala.cat");

    }
}
