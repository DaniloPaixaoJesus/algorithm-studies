package com.danilopaixao.design.builder;

public class Main {
    public static void main(String[] args) {
        FileGenerator fg = new FileGeneratorBuilder()
                                    .generateXml()
                                    .withAsync()
                                    .withCompress()
                                    .withCriptografy()
                                    .withLog()
                                    .build();
    }
}
