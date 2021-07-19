package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarExcecaoEscolarSemDiretor() {
        try {
            Escola escola = new Escola(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escola sem diretor", e.getMessage());
        }
    }

    @Test
    void deveRetornarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        Professor professor = new Professor(escolaridade);
        Escola escola = new Escola(professor);
        escolaridade.setDescricao("Superior");

        assertEquals("Superior", escola.getEscolaridadeDiretor());
    }

    @Test
    public void deveRetornarExcecaoEscolaSemDiretorEscolaridade() {
        try {
            Escola escola = new Escola();
            escola.getEscolaridadeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola sem diretor", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEstadoEscola() {
        Escola escola = new Escola();
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        escola.setCidade(cidade);
        assertEquals("MG", escola.getEstadoEscola());
    }

    @Test
    public void deveRetornarExcecaoEscolaSemCidade() {
        try {
            Escola escola = new Escola();
            escola.getEstadoEscola();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola sem cidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor() {
        Professor professor = new Professor(new Escolaridade("Superior"));
        Escola escola = new Escola(professor);
        professor.setNome("Maria");

        assertEquals("Maria", escola.getNomeDiretor());
    }

    @Test
    public void deveRetornarExcecaoEscolaSemDiretor() {
        try {
            Escola escola = new Escola();
            escola.getNomeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola sem diretor", e.getMessage());
        }
    }

}