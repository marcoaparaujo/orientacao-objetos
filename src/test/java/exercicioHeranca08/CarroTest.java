package exercicioHeranca08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCalcularCusto() {
        Carro carro = new Carro();
        carro.setPrecoBase(30000);
        assertEquals(150000, carro.calcularCusto());
    }

}