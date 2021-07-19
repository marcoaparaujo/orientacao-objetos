package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetonarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Mestrado");

        Professor professor = new Professor(escolaridade);

        assertEquals("Mestrado", professor.getDescricaoEscolaridade());
    }

    @Test
    void deveRetornarCidadeNaturalidadeProfessor() {
        Professor professor = new Professor(new Escolaridade("Superior"));
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        professor.setNaturalidade(cidade);

        assertEquals("Juiz de Fora", professor.getNomeCidade());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemNaturalidade() {
        try {
            Professor professor = new Professor(new Escolaridade("Superior"));
            professor.getNomeCidade();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Naturalidade obrigatoria", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoEnsinoProfessorLeciona() {
        Professor professor = new Professor(new Escolaridade("Superior"));
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Fundamental");
        curso.setTipoEnsino(tipoEnsino);
        professor.setContratacao(curso);

        assertEquals("Ensino Fundamental", professor.getTipoEnsinoContratadoParaLecionar());
    }

    @Test
    void deveRetornarExcecaoParaProfessorSemContratacao() {
        try {
            Professor professor = new Professor(new Escolaridade("Superior"));
            professor.getTipoEnsinoContratadoParaLecionar();
            fail();
        } catch (NullPointerException e){
            assertEquals("Sem contratação", e.getMessage());
        }
    }

}