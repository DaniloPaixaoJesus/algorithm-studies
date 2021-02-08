package com.danilopaixao.design.composition.recursion.chainofResponsibility;

public abstract class FileRecover {
    private FileRecover nextRecover;

    public FileRecover(FileRecover nextRecover) {
        this.nextRecover = nextRecover;
    }

    public FileRecovered recover(String filename) {
        FileRecovered a = execute(filename);
        if (a == null || !a.isValid())
            return runNext(filename);
        else
            return a;
    }

    protected FileRecovered runNext(String filename) {
        if (nextRecover == null)
            throw new RuntimeException("It is not possible recover this file");
        return nextRecover.recover(filename);
    }

    protected abstract FileRecovered execute(String filename);
}