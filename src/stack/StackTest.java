package stack;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void pilhaDeveComecarVazia() {
        Stack<String> pilha = new Stack<>();
        assertTrue(pilha.estaVazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void deveEmpilharElementos() {
        Stack<Integer> pilha = new Stack<>();
        pilha.empilhar(10);
        pilha.empilhar(20);
        assertFalse(pilha.estaVazia());
        assertEquals(2, pilha.tamanho());
    }

    @Test
    public void deveDesempilharNaOrdemCerta() throws Exception {
        Stack<String> pilha = new Stack<>();
        pilha.empilhar("A");
        pilha.empilhar("B");
        assertEquals("B", pilha.desempilhar());
        assertEquals("A", pilha.desempilhar());
        assertTrue(pilha.estaVazia());
    }

    @Test(expected = Exception.class)
    public void deveLancarExcecaoSeDesempilharPilhaVazia() throws Exception {
        new Stack<>().desempilhar();
    }
}
