package main.fila;

public class Fila {
    private int n; // n = quantidade de elementos na fila.
    private int head;
    private int tail;
    private int[] fila;

    public Fila(int tamanho) {
        this.fila = new int[tamanho];
        this.n = 0;
        this.tail = 0;
        this.head = 0;
    }

    public void enfileirar(int item) {
        fila[tail] = item;
        n = n + 1;
        if(tail == fila.length-1) {
            tail = 0;
        }
        else {
            tail = tail + 1;
        }
        if(n == fila.length) {
            resize(fila.length * 2);
        }
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int desenfileirar() {
        if(isEmpty()) {
            throw new RuntimeException("Underflow");
        }
        int item = fila[head];
        n = n - 1;
        if(head == fila.length-1) {
            head = 0;
        }
        else {
            head = head + 1;
        }
        if(n > 0 && n == (fila.length) / 4) {
            resize(fila.length / 2);
        }
        return item;
    }

    public void resize(int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for(int i = 0;i <= n-1;i++) {
            temp[i] = fila[(i + head) % fila.length];
        }
        fila = temp;
        head = 0;
        tail = n;
    }
}
