package relacionamentoBidirecionalNparaN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveMatricularAluno() {
        Aluno aluno = new Aluno("Maria");
        Turma turma = new Turma(2021, 1, new Disciplina("Orientação a Objetos"));

        turma.matricular(aluno);

        assertTrue(aluno.verificarMatriculaTurma(turma));
        assertTrue(turma.verificarMatriculaAluno(aluno));
    }

    @Test
    void deveDesmatricularAluno() {
        Aluno aluno = new Aluno("Maria");
        Turma turma = new Turma(2021, 1, new Disciplina("Orientação a Objetos"));

        turma.matricular(aluno);
        turma.desmatricular(aluno);

        assertFalse(aluno.verificarMatriculaTurma(turma));
        assertFalse(turma.verificarMatriculaAluno(aluno));
    }

    @Test
    void deveRetornarExcecaoMatriculaAlunoNulo() {
        try {
            Turma turma = new Turma(2021, 1, new Disciplina("Orientação a Objetos"));
            turma.matricular(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Aluno deve ser informado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDesmatriculaAlunoNulo() {
        try {
            Turma turma = new Turma(2021, 1, new Disciplina("Orientação a Objetos"));
            turma.desmatricular(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Aluno deve ser informado", e.getMessage());
        }
    }

}