package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomemTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Homem();
    }

    @Test
    void deveRetonarMasculinoAbaixoPeso() {
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1.0f);
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormal() {
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1.0f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcimaPeso() {
        pessoa.setPeso(27.7f);
        pessoa.setAltura(1.0f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdeal() {
        pessoa.setPeso(31.0f);
        pessoa.setAltura(1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetonarMasculinoObeso() {
        pessoa.setPeso(31.1f);
        pessoa.setAltura(1.0f);
        assertEquals("obeso", pessoa.calcularImc());
    }

}