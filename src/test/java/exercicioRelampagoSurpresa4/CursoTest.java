package exercicioRelampagoSurpresa4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomesProfessores() {
        Professor professor1 = new Professor("Marco");
        Professor professor2 = new Professor("Antonio");
        Turma turma1 = new Turma(new Disciplina("Orientação a Objetos"));
        Turma turma2 = new Turma(new Disciplina("Orientação a Objetos"));
        turma1.setProfessor(professor1);
        turma2.setProfessor(professor2);
        Curso curso = new Curso();
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        List<String> professores = Arrays.asList("Marco", "Antonio");

        assertEquals(professores, curso.getNomesProfessores());
    }

    @Test
    void deveRetornarNomesProfessoresComTurma() {
        Professor professor = new Professor("Marco");
        Turma turma1 = new Turma(new Disciplina("Orientação a Objetos"));
        Turma turma2 = new Turma(new Disciplina("Orientação a Objetos"));
        turma1.setProfessor(professor);
        Curso curso = new Curso();
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        List<String> professores = Arrays.asList("Marco");

        assertEquals(professores, curso.getNomesProfessores());
    }

    @Test
    void deveRetornarNomeProfessor() {
        Professor professor = new Professor("Marco");
        Turma turma1 = new Turma(new Disciplina("Orientação a Objetos"));
        turma1.setProfessor(professor);
        Curso curso = new Curso();
        curso.adicionarTurma(turma1);

        List<String> professores = Arrays.asList("Marco");

        assertEquals(professores, curso.getNomesProfessores());
    }

    @Test
    void deveRetornarListaVaziaNomesProfessores() {
        Curso curso = new Curso();

        assertEquals(new ArrayList<String>(), curso.getNomesProfessores());
    }

    @Test
    void deveRetornarNomesAlunosTurmas() {
        Curso curso = new Curso();
        Turma turma1 = new Turma(new Disciplina("Orientação a Objetos"));
        Turma turma2 = new Turma(new Disciplina("Orientação a Objetos"));
        Aluno aluno1 = new Aluno("Marco");
        Aluno aluno2 = new Aluno("Antonio");
        Aluno aluno3 = new Aluno("Pereira");
        Aluno aluno4 = new Aluno("Araujo");
        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        turma2.matricular(aluno3);
        turma2.matricular(aluno4);
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        List<String> alunos = Arrays.asList("Marco", "Antonio", "Pereira", "Araujo");

        assertEquals(alunos, curso.getNomesAlunosTurmas());
    }

    @Test
    void deveRetornarNomesAlunosTurmasDistinto() {
        Curso curso = new Curso();
        Turma turma1 = new Turma(new Disciplina("Orientação a Objetos"));
        Turma turma2 = new Turma(new Disciplina("Orientação a Objetos"));
        Aluno aluno1 = new Aluno("Marco");
        Aluno aluno2 = new Aluno("Antonio");
        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        turma2.matricular(aluno1);
        turma2.matricular(aluno2);
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        List<String> alunos = Arrays.asList("Marco", "Antonio");

        assertEquals(alunos, curso.getNomesAlunosTurmasDistintos());
    }

    @Test
    void deveRetornarNomesAlunosCurso() {
        Curso curso = new Curso();
        Aluno aluno1 = new Aluno("Marco");
        Aluno aluno2 = new Aluno("Antonio");
        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);

        List<String> alunos = Arrays.asList("Marco", "Antonio");

        assertEquals(alunos, curso.getNomesAlunosCurso());
    }

    @Test
    void deveRetornarListaVaziaDisciplinas() {
        Curso curso = new Curso();

        List<String> disciplinas = new ArrayList<String>();

        assertEquals(disciplinas, curso.getNomesDisciplinasTurmas());
    }

    @Test
    void deveRetornarListaNomeDisciplinaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        curso.adicionarTurma(turma);

        List<String> disciplinas = Arrays.asList("Orientação a Objetos");

        assertEquals(disciplinas, curso.getNomesDisciplinasTurmas());
    }

    @Test
    void deveRetornarListaNomesDisciplinasCurso() {
        Curso curso = new Curso();
        Turma turma1 = new Turma(new Disciplina("Algoritmos"));
        Turma turma2 = new Turma(new Disciplina("Orientação a Objetos"));
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        List<String> disciplinas = Arrays.asList("Algoritmos", "Orientação a Objetos");

        assertEquals(disciplinas, curso.getNomesDisciplinasTurmas());
    }

    @Test
    void deveRetornarVerdadeiroAlunoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Marco");
        curso.adicionarAluno(aluno);

        assertTrue(curso.verificarAlunoCurso(aluno));
    }

    @Test
    void deveRetornarFalsoAlunoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Marco");

        assertFalse(curso.verificarAlunoCurso(aluno));
    }

    @Test
    void deveRetornarVerdadeiroTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        curso.adicionarTurma(turma);

        assertTrue(curso.verificarTurmaCurso(turma));
    }

    @Test
    void deveRetornarFalsoTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));

        assertFalse(curso.verificarTurmaCurso(turma));
    }


    @Test
    void deveExcluirTurma() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));
        curso.adicionarTurma(turma);

        assertTrue(curso.excluirTurma(turma));
    }

    @Test
    void naoDeveExcluirTurma() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina("Orientação a Objetos"));

        assertFalse(curso.excluirTurma(turma));
    }

    @Test
    void deveExcluirAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Marco");
        curso.adicionarAluno(aluno);

        assertTrue(curso.excluirAluno(aluno));
    }

    @Test
    void naoDeveExcluirAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Marco");

        assertFalse(curso.excluirAluno(aluno));
    }

    @Test
    void deveExcluirAlunoPorNome() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Marco");
        curso.adicionarAluno(aluno);

        assertTrue(curso.excluirAluno("Marco"));
    }

    @Test
    void naoDeveExcluirAlunoPorNome() {
        Curso curso = new Curso();

        assertFalse(curso.excluirAluno("Marco"));
    }

    @Test
    void deveExcluirAlunoPesquisaObjeto() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Marco");
        curso.adicionarAluno(aluno);

        Aluno alunoPesquisa = curso.obterAluno("Marco");

        assertTrue(curso.excluirAluno(alunoPesquisa));
    }

    @Test
    void naoDeveExcluirAlunoPesquisaObjeto() {
        Curso curso = new Curso();

        Aluno alunoPesquisa = curso.obterAluno("Marco");

        assertFalse(curso.excluirAluno(alunoPesquisa));
    }

    @Test
    void deveRetornarAlunoPesquisaObjeto() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("Marco");
        curso.adicionarAluno(aluno);

        assertNotNull(curso.obterAluno("Marco"));
        assertEquals(aluno, curso.obterAluno("Marco"));
    }

    @Test
    void naoDeveRetornarAlunoPesquisaObjeto() {
        Curso curso = new Curso();

        assertNull(curso.obterAluno("Marco"));
    }

}