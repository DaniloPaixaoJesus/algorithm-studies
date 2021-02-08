package com.danilopaixao.design.inheritance.hookmethod.factorymethod;

public class FileGeneratorUtil {

    public <E> void generate(E e) {
        System.out.println("FileGeneratorUtil.generate## "+e.getClass().getName());
    }

}
