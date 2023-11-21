package exerRS4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomeProfessorTurma() {
        Professor professor = new Professor();
        professor.setNome("Ana");
        Disciplina disciplina = new Disciplina();
        Turma turma = new Turma(disciplina, professor);
        assertEquals("Ana", turma.getNomeProfessor());
    }

    @Test
    void deveVerificarProfessorNulo() {
        try {
            Disciplina disciplina = new Disciplina();
            Turma turma = new Turma(disciplina, null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Professor invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarDisciplinaNula() {
        try {
            Professor professor = new Professor();
            Turma turma = new Turma(null, professor);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Disciplina invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomesAlunos() {
        Turma turma = new Turma(new Disciplina(), new Professor());
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Joao");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        List<String> lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Maria");
        assertEquals(lista, turma.getNomesAlunos());
    }

    @Test
    void deveExistirAlunoTurma() {
        Turma turma = new Turma(new Disciplina(), new Professor());
        Aluno aluno = new Aluno();
        turma.matricular(aluno);
        assertTrue(turma.verificarAluno(aluno));
    }

    @Test
    void naoDeveExistirAlunoTurma() {
        Turma turma = new Turma(new Disciplina(), new Professor());
        Aluno aluno = new Aluno();
        assertFalse(turma.verificarAluno(aluno));
    }

    @Test
    void deveExcluirAluno() {
        Turma turma = new Turma(new Disciplina(), new Professor());
        Aluno aluno = new Aluno();
        turma.matricular(aluno);
        turma.excluirAluno(aluno);
        assertFalse(turma.verificarAluno(aluno));

    }

}