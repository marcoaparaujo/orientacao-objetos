package imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Mulher();
    }


    @Test
    void deveRetornarPesoValido() {
        pessoa.setPeso(1.0f);
        assertEquals(1.0f, pessoa.getPeso());
    }

    @Test
    void deveRetornarPesoInvalido() {
        try {
            pessoa.setPeso(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Peso invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlturaValida() {
        pessoa.setAltura(1.0f);
        assertEquals(1.0f, pessoa.getAltura());
    }

    @Test
    void deveRetornarAlturaInvalida() {
        try {
            pessoa.setAltura(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Altura invalida", e.getMessage());
        }
    }
}


