package com.danilopaixao.design.composition.recursion.composite;

public class Main {

    public static void main(String[] args) {
        SimpleFly fromGRUToBNB = new SimpleFly("São Paulo", "Brasília", 500);
        SimpleFly fromBNBToRecife = new SimpleFly("Brasília", "Recife", 300);

        SimpleFly fromRecifeToNatal = new SimpleFly("Recife", "Natal", 350);

        ConnectedFly fromBNBToNatal = new ConnectedFly(fromBNBToRecife, fromRecifeToNatal, 30);

        ConnectedFly fromGRUToNatal = new ConnectedFly(fromGRUToBNB, fromBNBToNatal, 50);

        // composite behavior when call FROM
        fromGRUToNatal.getOrigem();
            fromGRUToBNB.getOrigem();

        // composite behavior when call TO
        fromGRUToNatal.getDestino();
                fromBNBToNatal.getOrigem();
                    fromBNBToRecife.getOrigem();

    }
}
