package exercicioHeranca01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    Retangulo retangulo;

    @BeforeEach
    void setUp() {
        retangulo = new Retangulo();
    }

    @Test
    void deveCalcularArea() {
        retangulo.setAltura(1.0f);
        retangulo.setBase(1.0f);
        assertEquals(1.0f, retangulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetro() {
        retangulo.setAltura(1.0f);
        retangulo.setBase(1.0f);
        assertEquals(4.0f, retangulo.calcularPerimetro());
    }


}