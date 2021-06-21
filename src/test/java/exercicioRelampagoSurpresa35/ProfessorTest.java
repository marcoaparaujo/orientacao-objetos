package exercicioRelampagoSurpresa35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarInformacoes() {
        Professor professor = new Professor();
        professor.setNome("Marco");
        professor.setTitulacaoMaxima("Doutorado");
        assertEquals("Marco - Doutorado", professor.getInfo());
    }
}