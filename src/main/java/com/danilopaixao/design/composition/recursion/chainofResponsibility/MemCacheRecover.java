package com.danilopaixao.design.composition.recursion.chainofResponsibility;

import java.util.Map;
import java.util.HashMap;

public class MemCacheRecover extends FileRecover {
    private Map<String, FileRecovered> cache = new HashMap<>();

    public MemCacheRecover(FileRecover nextRecover) {
        super(nextRecover);
    }

    protected FileRecovered execute(String filename) {
        if (cache.containsKey(filename))
            return cache.get(filename);
        return null;
    }

    protected FileRecovered runNext(String filename) {
        FileRecovered a = super.runNext(filename);
        cache.put(filename, a);
        return a;
    }
}