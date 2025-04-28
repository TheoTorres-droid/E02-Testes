package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private final List<T> elementos = new ArrayList<>();

    public void empilhar(T item) {
        elementos.add(item);
    }

    public T desempilhar() throws Exception {
        if (estaVazia()) {
            throw new Exception("A pilha está vazia!");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }
}
