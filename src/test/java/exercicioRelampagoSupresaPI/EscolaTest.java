package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    void deveRetornarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Superior");

        Professor professor = new Professor(escolaridade);

        Escola escola = new Escola(professor);

        assertEquals("Superior", escola.retornaEscolaridadeDiretor());
    }

    @Test
    void deveRetornarExcecaoEscolarSemDiretor() {
        try {
            Escola escola = new Escola(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("diretor eh obrigatorio!", e.getMessage());
        }
    }


}