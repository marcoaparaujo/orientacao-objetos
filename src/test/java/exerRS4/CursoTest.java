package exerRS4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomesProfessores() {
        Curso curso = new Curso();
        Professor professor1 = new Professor();
        professor1.setNome("Marco");
        Turma turma1 = new Turma(new Disciplina(), professor1);
        curso.abrirTurma(turma1);
        Professor professor2 = new Professor();
        professor2.setNome("Antonio");
        Turma turma2 = new Turma(new Disciplina(), professor2);
        curso.abrirTurma(turma2);
        List<String> lista = new ArrayList<String>();
        lista.add("Marco");
        lista.add("Antonio");
        assertEquals(lista, curso.getNomesProfessores());
    }

    @Test
    void deveRetornarNomesAlunosTurmas() {
        Curso curso = new Curso();
        Turma turma1 = new Turma(new Disciplina(), new Professor());
        Turma turma2 = new Turma(new Disciplina(), new Professor());
        curso.abrirTurma(turma1);
        curso.abrirTurma(turma2);
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Joana");
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Marcelo");
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Paula");
        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        turma2.matricular(aluno3);
        turma2.matricular(aluno4);
        List<String> lista = new ArrayList<String>();
        lista.add("Pedro");
        lista.add("Joana");
        lista.add("Marcelo");
        lista.add("Paula");
        assertEquals(lista, curso.getNomesAlunosTurmas());
    }

    @Test
    void deveRetornarNomesAlunos() {
        Curso curso = new Curso();
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Joana");
        curso.matricular(aluno1);
        curso.matricular(aluno2);
        List<String> lista = new ArrayList<String>();
        lista.add("Pedro");
        lista.add("Joana");
        assertEquals(lista, curso.getNomesAlunos());
    }

    @Test
    void deveRetornarNomesDisciplinas() {
        Curso curso = new Curso();
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Orientacao a Objetos");
        Turma turma1 = new Turma(disciplina1, new Professor());
        curso.abrirTurma(turma1);
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Orientacao a Objetos II");
        Turma turma2 = new Turma(disciplina2, new Professor());
        curso.abrirTurma(turma2);
        List<String> lista = new ArrayList<String>();
        lista.add("Orientacao a Objetos");
        lista.add("Orientacao a Objetos II");
        assertEquals(lista, curso.getNomesDisciplinas());
    }

    @Test
    void deveExistirAlunoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        curso.matricular(aluno);
        assertTrue(curso.verificarAluno(aluno));
    }

    @Test
    void naoDeveExistirAlunoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        assertFalse(curso.verificarAluno(aluno));
    }

    @Test
    void deveExistirTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina(), new Professor());
        curso.abrirTurma(turma);
        assertTrue(curso.verificarTurma(turma));
    }

    @Test
    void naoDeveExistirTurmaCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina(), new Professor());
        assertFalse(curso.verificarTurma(turma));
    }

    @Test
    void deveExcluirTurma() {
        Curso curso = new Curso();
        Turma turma = new Turma(new Disciplina(), new Professor());
        curso.abrirTurma(turma);
        curso.excluirTurma(turma);
        assertFalse(curso.verificarTurma(turma));
    }

    @Test
    void deveExcluirAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno();
        curso.matricular(aluno);
        curso.excluirAluno(aluno);
        assertFalse(curso.verificarAluno(aluno));

    }

}