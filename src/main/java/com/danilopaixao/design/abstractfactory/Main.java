package com.danilopaixao.design.abstractfactory;

public class Main {

    public static void main(String[] args) {

        DataSource dbXxx = new DataSourceDBXXX();

        DataSource dbYyy = new DataSourceDBYYY();

        // Calling Statement factory DbXxx
        Statement statementDbXxx = dbXxx.createStatement();

        // Calling Statement factory DbYyy
        Statement statementDbYyy = dbYyy.createStatement();
    }
}
