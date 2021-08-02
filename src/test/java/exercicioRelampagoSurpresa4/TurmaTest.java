package exercicioRelampagoSurpresa4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomeProfessorTurma() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        Professor professor = new Professor("Marco");
        turma.setProfessor(professor);

        assertEquals("Marco", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarMensagemTurmaSemProfessor() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));

        assertEquals("Turma sem professor", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarExcecaoCriarTurmaSemDisciplina() {
        try {
            Turma turma = new Turma(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Disciplina obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetarNuloDisciplina() {
        try {
            Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
            turma.setDisciplina(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Disciplina obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDisciplina() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));

        assertEquals("Orientação a Objetos", turma.getNomeDisciplina());
    }

    @Test
    void deveRetornarNomesAlunos() {
        Aluno aluno1 = new Aluno("Marco");
        Aluno aluno2 = new Aluno("Antonio");
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        turma.matricular(aluno1);
        turma.matricular(aluno2);

        List<String> lista = Arrays.asList("Marco", "Antonio");

        assertEquals(lista, turma.getNomesAlunos());
    }

    @Test
    void deveRetornarNomeAluno() {
        Aluno aluno = new Aluno("Marco");
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        turma.matricular(aluno);

        List<String> lista = Arrays.asList("Marco");

        assertEquals(lista, turma.getNomesAlunos());
    }

    @Test
    void deveRetornarListaVaziaNomesAlunos() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));

        assertEquals(new ArrayList<String>(), turma.getNomesAlunos());
    }

    @Test
    void deveRetornarListaNomesAlunosComTamanhoZero() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));

        assertEquals(0, turma.getNomesAlunos().size());
    }

    @Test
    void deveRetornarVerdadeiroAlunoTurma() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        Aluno aluno = new Aluno("Marco");
        turma.matricular(aluno);

        assertTrue(turma.verificarAlunoTurma(aluno));
    }

    @Test
    void deveRetornarFalsoAlunoTurma() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        Aluno aluno = new Aluno("Marco");

        assertFalse(turma.verificarAlunoTurma(aluno));
    }

    @Test
    void deveExcluirAluno() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        Aluno aluno = new Aluno("Marco");
        turma.matricular(aluno);

        assertTrue(turma.excluirAluno(aluno));
    }

    @Test
    void deveExcluirAluno_v2() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        Aluno aluno = new Aluno("Marco");
        turma.matricular(aluno);
        turma.excluirAluno(aluno);

        assertFalse(turma.verificarAlunoTurma(aluno));
    }

    @Test
    void naoDeveExcluirAluno() {
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        Aluno aluno = new Aluno("Marco");

        assertFalse(turma.excluirAluno(aluno));
    }

}