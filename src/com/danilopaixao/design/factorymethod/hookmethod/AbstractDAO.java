package com.danilopaixao.design.factorymethod.hookmethod;

import java.util.List;

public interface AbstractDAO<E> {
    public E getById(Object id);
    public void save(E entidade);
    public void delete(Object id);
    public List<E> getAll();
}
