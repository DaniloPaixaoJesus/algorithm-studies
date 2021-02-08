package com.danilopaixao.design.composition.recursion.composite;

public class ConnectedFly implements TrechoAereo {
    private TrechoAereo primeiro;
    private TrechoAereo segundo;
    private double taxaconexao;

    public ConnectedFly(TrechoAereo primeiro, TrechoAereo segundo,
                        double taxaconexao) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaconexao = taxaconexao;
        if (primeiro.getDestino() != segundo.getOrigem())
            throw new RuntimeException("O destino do primeiro" +
                    "não é igual a origem do segundo");
    }

    public String getOrigem() {
        return primeiro.getOrigem();
    }

    public String getDestino() {
        return segundo.getDestino();
    }

    public double getPreco() {
        return primeiro.getPreco() + segundo.getPreco() +
                taxaconexao;
    }
}