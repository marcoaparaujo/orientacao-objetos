package exercicioHeranca08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    @Test
    void deveCalcularCusto() {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setPrecoBase(2000);
        assertEquals(4000, bicicleta.calcularCusto());
    }

}