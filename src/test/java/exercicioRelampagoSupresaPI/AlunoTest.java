package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarEstadoNaturalidadeAluno() {
        Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        aluno.setNaturalidade(cidade);

        assertEquals("MG", aluno.getEstadoCidade());
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemNaturalidade() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
            aluno.getEstadoCidade();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Pessoa sem naturalidade", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoQueAlunoEstuda() {
        Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
        Curso curso = new Curso();
        Escola escola = new Escola();
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        escola.setCidade(cidade);
        curso.setEscola(escola);
        aluno.setCurso(curso);

        assertEquals("MG", aluno.retornaEstadoEscolaAluno());
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemCurso() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
            aluno.retornaEstadoEscolaAluno();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Aluno sem curso", e.getMessage());
        }
    }

    @Test
    void deveRetornarCoordenadorCursoAluno() {
        Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
        Curso curso = new Curso();
        Professor professorCoordenador = new Professor(new Escolaridade("Superior"));
        professorCoordenador.setNome("Antonio");
        curso.setCoordenador(professorCoordenador);
        aluno.setCurso(curso);

        assertEquals("Antonio", aluno.getNomeCoordenadorCursoAluno());
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemCoordenadorCurso() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Ensino Fundamental"));
            aluno.getNomeCoordenadorCursoAluno();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Aluno sem curso", e.getMessage());
        }
    }

}