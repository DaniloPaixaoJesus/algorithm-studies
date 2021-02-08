package com.danilopaixao.design.inheritance.hookmethod.factorymethod;

import java.util.List;

public interface AbstractDAO<E> {
    public E getById(Object id);
    public void save(E entidade);
    public void delete(Object id);
    public List<E> getAll();
}
