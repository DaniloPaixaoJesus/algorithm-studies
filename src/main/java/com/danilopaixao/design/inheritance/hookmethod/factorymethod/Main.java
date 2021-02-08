package com.danilopaixao.design.inheritance.hookmethod.factorymethod;

public class Main {

    public static void main(String[] args) {
        ProductService service = new ProductService(new FileGeneratorUtil(), new ProductDAO());
        service.gravarEntidadeEmArquivo("2", "filename");
    }

}
