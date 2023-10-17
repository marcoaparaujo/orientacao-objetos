package associacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarNomeCursoAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno(curso);
        curso.setNome("Ciencia da Computacao");
        assertEquals("Ciencia da Computacao", aluno.getCurso().getNome());
    }

    @Test
    void deveRetornarNomeCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno(curso);
        curso.setNome("Ciencia da Computacao");
        assertEquals("Ciencia da Computacao", aluno.getNomeCurso());
    }

}