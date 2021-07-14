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

    @Test
    void deveRetornarEstadoQueAlunoEstuda() {
        Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
        Curso curso = new Curso();
        Escola escola = new Escola();
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));

        escola.setCidadeEscola(cidade);
        curso.setEscolaCurso(escola);
        aluno.setCursoAluno(curso);

        assertEquals("MG", aluno.retornaEstadoEscolaAluno());

    }

    @Test
    void deveRetornarExcecaoParaAlunoSemCurso() {
        try{
            Aluno aluno = new Aluno(new Escolaridade("Superior"));
            aluno.retornaEstadoEscolaAluno();
            fail();
        }catch (NullPointerException e){
            assertEquals("Curso não informado!", e.getMessage());
        }
    }
}