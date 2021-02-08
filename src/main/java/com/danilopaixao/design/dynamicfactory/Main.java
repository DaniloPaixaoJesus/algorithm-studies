package com.danilopaixao.design.dynamicfactory;

import java.io.IOException;

public class Main {
    private static String propertiesPath = "src/main/java/com/danilopaixao/design/dynamicfactory/application.properties";

    public static void main(String[] args) throws IOException {

        DynamicFactory factory = new DynamicFactory(propertiesPath);
        PosProcessor object = factory.createObject(PosProcessor.class);

        System.out.println(object.getClass().getCanonicalName());
    }

}
