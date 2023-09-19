package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MulherTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Mulher();
    }

    @Test
    void deveRetonarFemininoAbaixoPeso() {
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal() {
        pessoa.setPeso(25.7f);
        pessoa.setAltura(1.0f);
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcimaPeso() {
        pessoa.setPeso(27.2f);
        pessoa.setAltura(1.0f);
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoAcimaPesoIdeal() {
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1.0f);
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetonarFemininoObeso() {
        pessoa.setPeso(32.3f);
        pessoa.setAltura(1.0f);
        assertEquals("obeso", pessoa.calcularImc());
    }

}