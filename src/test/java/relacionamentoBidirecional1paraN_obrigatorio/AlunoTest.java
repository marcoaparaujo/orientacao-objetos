package relacionamentoBidirecional1paraN_obrigatorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetonarExcecaoAlunoSemCurso() {
        try {
            Aluno aluno = new Aluno("Ana", null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Curso obrigatório", e.getMessage());
        }
    }

    @Test
    void deveMatricularAlunoNovo() {
        Curso curso = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana", curso);

        assertEquals("Ciência da Computação", aluno.getNomeCurso());
        assertTrue(curso.verificarAlunoMatriculado(aluno));
    }

    @Test
    void deveTransferirAluno() {
        Curso curso1 = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana", curso1);

        Curso curso2 = new Curso("Sistemas de Informação");
        aluno.matricular(curso2);

        assertEquals("Sistemas de Informação", aluno.getNomeCurso());
        assertFalse(curso1.verificarAlunoMatriculado(aluno));
        assertTrue(curso2.verificarAlunoMatriculado(aluno));
    }

    @Test
    void deveVerificarAlunoMudarParaCursoNulo() {
        try {
            Curso curso1 = new Curso("Ciência da Computação");
            Aluno aluno = new Aluno("Ana", curso1);

            aluno.matricular(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Curso obrigatório", e.getMessage());
        }
    }

}