package com.danilopaixao.design.composition.recursion.chainofResponsibility;

import java.util.HashMap;
import java.util.Map;

public class RemoteServerRecover extends FileRecover {
    private Map<String, FileRecovered> remoteServerAccess = new HashMap<>();

    public RemoteServerRecover(FileRecover nextRecover) {
        super(nextRecover);
    }

    protected FileRecovered execute(String filename) {
        if (remoteServerAccess.containsKey(filename))
            return remoteServerAccess.get(filename);
        return null;
    }

    protected FileRecovered runNext(String filename) {
        return super.runNext(filename);
    }
}