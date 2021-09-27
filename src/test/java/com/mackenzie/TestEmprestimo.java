package com.mackenzie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestEmprestimo {
    
    public TestEmprestimo() {}

    @Test
    public void testSaldoMaior() {
        boolean resultado = Emprestimo.pedir(1500, false, false);
        boolean resultado1 = Emprestimo.pedir(1500, true, false);
        boolean resultado2 = Emprestimo.pedir(1500, false, true);
        boolean resultado3 = Emprestimo.pedir(1500, true, true);
        

        assertEquals(resultado, true);
        assertEquals(resultado1, true);
        assertEquals(resultado2, true);
        assertEquals(resultado3, true);;
    }

    @Test
    public void testBomHistorico() {
        boolean resultado = Emprestimo.pedir(900, true, false);
        boolean resultado1 = Emprestimo.pedir(900, true, true);
        boolean resultado2 = Emprestimo.pedir(1500, true, false);
        boolean resultado3 = Emprestimo.pedir(1500, true, true);

        assertEquals(resultado, true);
        assertEquals(resultado1, true);
        assertEquals(resultado2, true);
        assertEquals(resultado3, true);
    }

    @Test
    public void testConcessao() {
        boolean resultado = Emprestimo.pedir(900, false, true);
        boolean resultado1 = Emprestimo.pedir(900, true, true);
        boolean resultado2 = Emprestimo.pedir(1500, false, true);
        boolean resultado3 = Emprestimo.pedir(1500, true, true);

        assertEquals(resultado, true);
        assertEquals(resultado1, true);
        assertEquals(resultado2, true);
        assertEquals(resultado3, true);
    }

    @Test
    public void testNegado() {
        boolean resultado = Emprestimo.pedir(900, false, false);
        assertEquals(resultado, false);
    }

}
