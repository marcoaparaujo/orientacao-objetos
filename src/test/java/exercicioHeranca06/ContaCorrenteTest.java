package exercicioHeranca06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    ContaCorrente conta;

    @BeforeEach
    void setUp() {
        conta = new ContaCorrente();
    }

    @Test
    void deveTestarValorNegativo() {
        try {
            conta.depositar(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveEfetuarDepositoComTaxaManutencao() {
        conta.setTaxaManutencao(2.0f);
        conta.depositar(100.0f);
        assertEquals(98.0f, conta.getSaldo());
    }

    @Test
    void deveEfetuarDepositoSemTaxaManutencao() {
        conta.setTaxaManutencao(2.0f);
        conta.depositar(100.0f);
        conta.depositar(100.0f);
        assertEquals(198.0f, conta.getSaldo());
    }

    @Test
    void deveTestarSaqueInvalido() {
        try {
            conta.setSaldo(100.0f);
            conta.sacar(100.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveTestarSaqueValido() {
        conta.setSaldo(100.0f);
        conta.sacar(100.0f);
        assertEquals(0.0f, conta.getSaldo());
    }

}