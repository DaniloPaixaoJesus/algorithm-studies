package com.danilopaixao.design.inheritance.hookmethod.factorymethod;

import java.math.BigDecimal;

public class ProductService extends AbstractService<ProductEntity> {

    private ProductDAO dao;

    public ProductService(FileGeneratorUtil gerador, ProductDAO dao) {
        super(gerador);
        this.dao = dao;
    }

    public AbstractDAO<ProductEntity> getDAO(){
        System.out.println("getDAO implemented on ProductService");
        if(dao == null){
            dao = new ProductDAO();
        }
        return dao;
    }

    public BigDecimal getPrice(String id){
        ProductEntity p = getDAO().getById(id);
        return p.getPreco();
    }
}