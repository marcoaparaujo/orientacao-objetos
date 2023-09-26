package exercicioHeranca04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void deveCalcularPreco() {
        VooInternacional voo = new VooInternacional();
        voo.setDistancia(2000.0f);
        voo.setFatorPreco(0.1f);
        voo.setFatorConversaoMoeda(5.0f);
        assertEquals(1000.0f, voo.calcularPreco());
    }

}