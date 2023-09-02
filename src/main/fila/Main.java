package main.fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);

        System.out.println("Fila está vazia? " + fila.isEmpty());
        System.out.println("Desenfileirado: " + fila.desenfileirar());

        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.enfileirar(60);

        System.out.println("Fila está vazia? " + fila.isEmpty());

        while (!fila.isEmpty()) {
            System.out.println("Desenfileirado: " + fila.desenfileirar());
        }
        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}
