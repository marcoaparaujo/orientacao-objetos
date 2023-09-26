package exercicioHeranca04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooNacionalTest {

    @Test
    void deveCalcularPreco() {
        VooNacional voo = new VooNacional();
        voo.setDistancia(1000.0f);
        voo.setFatorPreco(0.2f);
        assertEquals(200.0f, voo.calcularPreco());
    }

}