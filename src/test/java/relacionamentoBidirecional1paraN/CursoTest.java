package relacionamentoBidirecional1paraN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveMatricularAluno() {
        Curso curso = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana");

        curso.matricularAluno(aluno);

        assertTrue(curso.verificarAlunoMatriculado(aluno));
        assertEquals("Ciência da Computação", aluno.getNomeCurso());
    }

    @Test
    void deveCancelarMatriculaAluno() {
        Curso curso = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana");

        curso.matricularAluno(aluno);
        curso.cancelarAluno(aluno);

        assertFalse(curso.verificarAlunoMatriculado(aluno));
        assertEquals("Aluno sem curso", aluno.getNomeCurso());
    }

}