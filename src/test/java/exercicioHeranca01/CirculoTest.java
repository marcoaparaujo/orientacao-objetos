package exercicioHeranca01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo();
    }

    @Test
    void deveCalcularArea() {
        circulo.setRaio(2);
        assertEquals(12.5664f, circulo.calcularArea(), 0.0001f);
    }

    @Test
    void deveCalcularPerimetro() {
        circulo.setRaio(2);
        assertEquals(12.5664f, circulo.calcularPerimetro(), 0.0001f);
    }

}