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

}