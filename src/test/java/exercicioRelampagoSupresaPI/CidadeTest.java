package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    public void deveRetornarEstadoCidade() {
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    public void deveRetornarExcecaoCidadeSemEstado() {
        try {
            Cidade cidade = new Cidade("Juiz de Fora",null);
            cidade.getNomeEstado();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Cidade sem estado", e.getMessage());
        }
    }
}