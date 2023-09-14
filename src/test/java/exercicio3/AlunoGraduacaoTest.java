package exercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    AlunoGraduacao aluno;

    @BeforeEach
    void setUp() {
        aluno = new AlunoGraduacao();
    }

    @Test
    void deveRetornarAprovado() {
        aluno.setNota1(7);
        aluno.setNota2(7);
        assertEquals(true, aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovado() {
        aluno.setNota1(6);
        aluno.setNota2(7);
        assertEquals(false, aluno.verificarAprovacao());
    }
}