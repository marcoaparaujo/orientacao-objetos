package exercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    AlunoGraduacao aluno;

    @BeforeEach
    void setUp() {
        aluno = new AlunoGraduacao();
    }

    @Test
    void deveRetornarNota1Valida() {
        aluno.setNota1(0);
        assertEquals(0, aluno.getNota1());
    }

    @Test
    void deveRetornarNota2Valida() {
        aluno.setNota2(0);
        assertEquals(0, aluno.getNota2());
    }

    @Test
    void deveRetornarNota1Negativa() {
        try {
            aluno.setNota1(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarNota2Negativa() {
        try {
            aluno.setNota2(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarNota1Maior100() {
        try {
            aluno.setNota1(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarNota2Maior100() {
        try {
            aluno.setNota2(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nota invalida", e.getMessage());
        }
    }
}