package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno() {
        Aluno aluno = new Aluno(new Escolaridade("Superior"));
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        aluno.setNaturalidade(cidade);

        assertEquals("MG", aluno.getEstadoCidade());
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemNaturalidade() {
        try{
            Aluno aluno = new Aluno(new Escolaridade("Superior"));
            aluno.getEstadoCidade();
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Naturalidade obrigatoria", e.getMessage());
        }

    }
}