package relacionamentoBidirecionalNparaN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveMatricularAluno() {
        Aluno aluno = new Aluno("Maria");
        Turma turma = new Turma(2021, 1, new Disciplina("Orientação a Objetos"));

        aluno.matricular(turma);

        assertTrue(aluno.verificarMatriculaTurma(turma));
        assertTrue(turma.verificarMatriculaAluno(aluno));
    }

    @Test
    void deveDesmatricularAluno() {
        Aluno aluno = new Aluno("Maria");
        Turma turma = new Turma(2021, 1, new Disciplina("Orientação a Objetos"));

        aluno.matricular(turma);
        aluno.desmatricular(turma);

        assertFalse(aluno.verificarMatriculaTurma(turma));
        assertFalse(turma.verificarMatriculaAluno(aluno));
    }

    @Test
    void deveRetornarExcecaoMatriculaTurmaNula() {
        try {
            Aluno aluno = new Aluno("Maria");
            aluno.matricular(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Turma deve ser informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDesmatriculaTurmaNula() {
        try {
            Aluno aluno = new Aluno("Maria");
            aluno.desmatricular(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Turma deve ser informada", e.getMessage());
        }
    }

}