package exercicioRelampagoSurpresa35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void deveRetonarAprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7.0f);
        aluno.setNota2(6.9f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        aluno.setNome("Marco");
        aluno.setMatricula(1);
        assertEquals("Marco - 1 - Aprovado", aluno.getInfo());
    }
}