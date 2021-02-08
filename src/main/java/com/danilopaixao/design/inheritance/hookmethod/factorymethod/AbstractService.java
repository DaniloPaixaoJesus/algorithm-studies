package com.danilopaixao.design.inheritance.hookmethod.factorymethod;

public abstract class AbstractService<E>{

    public FileGeneratorUtil gerador;

    public AbstractService(FileGeneratorUtil gerador){
        this.gerador = gerador;
    }

    public abstract AbstractDAO<E> getDAO();

    public void gravarEntidadeEmArquivo(Object id, String nomeArquivo){
        System.out.println("AbstractService.gravarEntidadeEmArquivo## called because of factory method");
        E entidade = getDAO().getById(id);
        gerador.generate(entidade);
    }
}
