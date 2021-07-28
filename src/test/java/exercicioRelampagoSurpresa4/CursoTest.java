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
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
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
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
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
        Turma turma1 = new Turma();
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
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
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
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
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

}