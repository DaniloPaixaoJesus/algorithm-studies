package com.danilopaixao.design.composition.recursion.chainofResponsibility;

import java.util.HashMap;
import java.util.Map;

public class DataBaseRecover extends FileRecover {
    private Map<String, FileRecovered> dataBaseStrategy = new HashMap<>();

    public DataBaseRecover(FileRecover nextRecover) {
        super(nextRecover);
    }

    protected FileRecovered execute(String filename) {
        if (dataBaseStrategy.containsKey(filename))
            return dataBaseStrategy.get(filename);
        return null;
    }

    protected FileRecovered runNext(String filename) {
        return super.runNext(filename);
    }
}