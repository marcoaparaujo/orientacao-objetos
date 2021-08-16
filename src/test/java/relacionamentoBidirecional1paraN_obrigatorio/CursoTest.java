package relacionamentoBidirecional1paraN_obrigatorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveMatricularAlunoInicial() {
        Curso curso = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana", curso);

        assertTrue(curso.verificarAlunoMatriculado(aluno));
        assertEquals("Ciência da Computação", aluno.getNomeCurso());
    }

    @Test
    void deveMatricularAluno() {
        Curso curso1 = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana", curso1);

        Curso curso2 = new Curso("Sistemas de Informação");
        curso2.matricularAluno(aluno);

        assertFalse(curso1.verificarAlunoMatriculado(aluno));
        assertTrue(curso2.verificarAlunoMatriculado(aluno));
        assertEquals("Sistemas de Informação", aluno.getNomeCurso());
    }

    @Test
    void deveMatricularAlunoMesmoCurso() {
        Curso curso = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana", curso);

        curso.matricularAluno(aluno);

        assertTrue(curso.verificarAlunoMatriculado(aluno));
        assertEquals("Ciência da Computação", aluno.getNomeCurso());
    }

    @Test
    void deveTransferirAluno() {
        Curso curso1 = new Curso("Ciência da Computação");
        Aluno aluno = new Aluno("Ana", curso1);

        Curso curso2 = new Curso("Sistemas de Informação");
        curso1.transferirAluno(aluno, curso2);

        assertFalse(curso1.verificarAlunoMatriculado(aluno));
        assertTrue(curso2.verificarAlunoMatriculado(aluno));
        assertEquals("Sistemas de Informação", aluno.getNomeCurso());
    }


}