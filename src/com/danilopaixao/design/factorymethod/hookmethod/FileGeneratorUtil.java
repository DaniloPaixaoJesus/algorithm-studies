package com.danilopaixao.design.factorymethod.hookmethod;

public class FileGeneratorUtil {

    public <E> void generate(E e) {
        System.out.println("FileGeneratorUtil.generate## "+e.getClass().getName());
    }

}
