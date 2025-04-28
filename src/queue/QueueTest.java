package queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void filaDeveComecarVazia() {
        Queue<String> fila = new Queue<>();
        assertTrue(fila.estaVazia());
        assertEquals(0, fila.tamanho());
    }

    @Test
    public void deveEnfileirarElementos() {
        Queue<Integer> fila = new Queue<>();
        fila.enfileirar(10);
        fila.enfileirar(20);
        assertEquals(2, fila.tamanho());
    }

    @Test
    public void deveDesenfileirarElementosNaOrdemCorreta() throws Exception {
        Queue<String> fila = new Queue<>();
        fila.enfileirar("A");
        fila.enfileirar("B");
        assertEquals("A", fila.desenfileirar());
        assertEquals("B", fila.desenfileirar());
    }

    @Test(expected = Exception.class)
    public void deveLancarExcecaoSeDesenfileirarFilaVazia() throws Exception {
        new Queue<>().desenfileirar();
    }
}
