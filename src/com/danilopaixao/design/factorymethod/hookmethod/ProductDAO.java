package com.danilopaixao.design.factorymethod.hookmethod;

import java.math.BigDecimal;
import java.util.List;

public class ProductDAO implements AbstractDAO<ProductEntity> {

    @Override
    public ProductEntity getById(Object id) {
        return new ProductEntity();
    }

    @Override
    public void save(ProductEntity entidade) {

    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<ProductEntity> getAll() {
        return List.of(new ProductEntity());
    }

}
