package exercicioRelampagoSupresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarEstado() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade(estado);

        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoEstadoNulo() {
        try {
            Cidade cidade = new Cidade(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetEstadoNulo() {
        try {
            Cidade cidade = new Cidade(new Estado("MG"));
            cidade.setEstado(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado obrigatorio", e.getMessage());
        }
    }

}