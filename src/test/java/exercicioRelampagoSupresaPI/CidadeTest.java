package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    public void deveRetornarEstadoCidade() {
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        assertEquals("MG", cidade.retornaEstadoCidade());
    }

    @Test
    public void deveRetornarExcecaoCidadeSemEstado() {
        try {
            Cidade cidade = new Cidade("Juiz de Fora",null);
            cidade.retornaEstadoCidade();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Estado não informado!", e.getMessage());
        }
    }
}