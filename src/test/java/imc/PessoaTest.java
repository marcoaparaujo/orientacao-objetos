package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveRetonarFemininoAbaixoPeso() {
        pessoa.setPeso(19.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal() {
        pessoa.setPeso(25.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcimaPeso() {
        pessoa.setPeso(27.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarFemininoAcimaPesoIdeal() {
        pessoa.setPeso(32.2f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetonarFemininoObeso() {
        pessoa.setPeso(32.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("F");
        assertEquals("obeso", pessoa.calcularImc());
    }

    @Test
    void deveRetonarMasculinoAbaixoPeso() {
        pessoa.setPeso(20.6f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("abaixo do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormal() {
        pessoa.setPeso(26.3f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("no peso normal", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcimaPeso() {
        pessoa.setPeso(27.7f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("marginalmente acima do peso", pessoa.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdeal() {
        pessoa.setPeso(31.0f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("acima do peso ideal", pessoa.calcularImc());
    }

    @Test
    void deveRetonarMasculinoObeso() {
        pessoa.setPeso(31.1f);
        pessoa.setAltura(1.0f);
        pessoa.setSexo("M");
        assertEquals("obeso", pessoa.calcularImc());
    }
}


