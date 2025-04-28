package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue<T> {

    private Queue<T> fila = new LinkedList<>();

    public void enfileirar(T item) {
        fila.offer(item);  
    }

    public T desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("Fila vazia!");
        }
        return fila.poll(); 
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public int tamanho() {
        return fila.size();
    }
}
