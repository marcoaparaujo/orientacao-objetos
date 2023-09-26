package exercicioHeranca02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveCalcularPagamento() {
        Gerente gerente = new Gerente();
        gerente.setSalarioMensal(1000.0f);
        gerente.setBonus(200.0f);
        assertEquals(1200.0f, gerente.calcularPagamento());
    }

}