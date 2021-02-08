package com.danilopaixao.design.abstractfactory;

public interface DataSource {
public ResultSet createResultSet(String sql);
public Statement createStatement();
public CriteriaResult createCriteriaResult(ResultSet r);
}