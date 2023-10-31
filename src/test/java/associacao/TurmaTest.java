package associacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveMatricularAluno() {
        Aluno aluno = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina());
        turma.matricular(aluno);
        assertEquals(1, turma.getNumeroAlunos());
        assertTrue(turma.verificarMatricula(aluno));
    }

    @Test
    void deveDesmatricularAluno() {
        Aluno aluno = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina());
        turma.matricular(aluno);
        turma.desmatricular(aluno);
        assertEquals(0, turma.getNumeroAlunos());
        assertFalse(turma.verificarMatricula(aluno));
    }

    @Test
    void deveMatricularDoisAlunos() {
        Aluno aluno1 = new Aluno(new Curso());
        Aluno aluno2 = new Aluno(new Curso());
        Turma turma = new Turma(new Disciplina());
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        assertEquals(2, turma.getNumeroAlunos());
    }

}