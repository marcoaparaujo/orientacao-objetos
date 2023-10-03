package exercicioHeranca08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveCalcularCusto() {
        Moto moto = new Moto();
        moto.setPrecoBase(10000);
        assertEquals(30000, moto.calcularCusto());
    }

}