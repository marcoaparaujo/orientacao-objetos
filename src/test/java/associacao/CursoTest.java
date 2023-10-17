package associacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomeCoordenador() {
        Professor coordenador = new Professor();
        coordenador.setNome("Ana");
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);
        assertEquals("Ana", curso.getNomeCoordenador());
    }

    @Test
    void deveVerificarCursoSemCoordenador() {
        try {
            Curso curso = new Curso();
            curso.getNomeCoordenador();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Curso sem coordenador", e.getMessage());
        }

    }

}