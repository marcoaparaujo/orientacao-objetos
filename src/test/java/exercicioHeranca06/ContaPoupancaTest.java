package exercicioHeranca06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    ContaPoupanca conta;

    @BeforeEach
    void setUp() {
        conta = new ContaPoupanca();
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
        conta.depositar(100.0f);
        assertEquals(100.0f, conta.getSaldo());
    }

    @Test
    void deveCalcularJuros() {
        conta.setTaxaJuros(10.0f);
        conta.setSaldo(1000.0f);
        conta.calcularJuros();
        assertEquals(1100.0f, conta.getSaldo());
    }

    @Test
    void deveCalcularJuros1x() {
        conta.setTaxaJuros(10.0f);
        conta.setSaldo(1000.0f);
        conta.calcularJuros();
        conta.calcularJuros();
        assertEquals(1100.0f, conta.getSaldo());
    }

}