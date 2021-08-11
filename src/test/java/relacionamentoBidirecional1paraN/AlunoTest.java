package relacionamentoBidirecional1paraN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveMatricularAlunoNovo() {
        Aluno aluno = new Aluno ("Ana");
        Curso curso = new Curso ("Ciência da Computação");
        aluno.matricular(curso);

        assertEquals("Ciência da Computação", aluno.getNomeCurso());
        assertTrue(curso.verificarAlunoMatriculado(aluno));
    }

    @Test
    void deveTransferirAluno() {
        Aluno aluno = new Aluno ("Ana");
        Curso curso1 = new Curso ("Ciência da Computação");
        aluno.matricular(curso1);

        Curso curso2 = new Curso("Sistemas de Informação");
        aluno.matricular(curso2);

        assertEquals("Sistemas de Informação", aluno.getNomeCurso());
        assertFalse(curso1.verificarAlunoMatriculado(aluno));
        assertTrue(curso2.verificarAlunoMatriculado(aluno));
    }

    @Test
    void deveVerificarAlunoSemCurso() {
        Aluno aluno = new Aluno("Ana");

        assertEquals("Aluno sem curso", aluno.getNomeCurso());
    }

    @Test
    void deveVerificarAlunoMudarParaCursoNulo() {
        Aluno aluno = new Aluno("Ana");
        Curso curso1 = new Curso ("Ciência da Computação");
        aluno.matricular(curso1);

        aluno.matricular(null);

        assertEquals("Aluno sem curso", aluno.getNomeCurso());
        assertFalse(curso1.verificarAlunoMatriculado(aluno));
    }

}