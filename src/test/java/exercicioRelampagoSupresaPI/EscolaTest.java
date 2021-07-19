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

    @Test
    public void deveRetornarEstadoEscola() {
        Escola escola = new Escola();
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        escola.setCidadeEscola(cidade);
        assertEquals("MG", escola.retornaEstadoEscola());
    }

    @Test
    public void deveRetornarExcecaoEscolaSemCidade() {
        try {
            Escola escola = new Escola();
            escola.retornaEstadoEscola();
            fail();
        } catch(NullPointerException e) {
            assertEquals("Cidade não informada!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoEscolaSemDiretor() {
        try {
            Escola escola = new Escola();
            escola.getNomeDiretor();
            fail();
        } catch(NullPointerException e) {
            assertEquals("Escola sem diretor", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Superior");

        Professor professor = new Professor(escolaridade);
        professor.setNome("Maria");

        Escola escola = new Escola(professor);

        assertEquals("Maria", escola.getNomeDiretor());
    }

}