package com.danilopaixao.design.factorymethod.hookmethod;

public class Main {

    public static void main(String[] args) {
        ProductService service = new ProductService(new FileGeneratorUtil(), new ProductDAO());
        service.gravarEntidadeEmArquivo("2", "filename");
    }

}
