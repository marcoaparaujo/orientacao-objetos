package relacionamentoBidirecional1para1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveVerificarRelacionamentoCursoCoordenador() {
        Curso curso = new Curso("Ciência da Computação");
        Professor professor = new Professor("João");

        curso.setCoordenador(professor);

        assertEquals("João", curso.getNomeCoordenador());
        assertEquals("Ciência da Computação", professor.getNomeCursoCoordenacao());
    }

    @Test
    void deveVerificarMudancaCoordenacao() {
        Curso curso = new Curso("Ciência da Computação");
        Professor professor1 = new Professor("João");
        curso.setCoordenador(professor1);

        Professor professor2 = new Professor("Maria");
        curso.setCoordenador(professor2);

        assertEquals("Ciência da Computação", professor2.getNomeCursoCoordenacao());
        assertEquals("Professor não coordena curso", professor1.getNomeCursoCoordenacao());
        assertEquals("Maria", curso.getNomeCoordenador());
    }

    @Test
    void deveVerificarCursoSemCoordenador() {
        Curso curso = new Curso("Ciência da Computação");
        curso.setCoordenador(null);

        assertEquals("Curso sem coordenador", curso.getNomeCoordenador());
    }

    @Test
    void deveVerificarCursoFicarSemCoordenacao() {
        Curso curso = new Curso("Ciência da Computação");
        Professor professor = new Professor("João");
        curso.setCoordenador(professor);

        curso.setCoordenador(null);

        assertEquals("Professor não coordena curso", professor.getNomeCursoCoordenacao());
        assertEquals("Curso sem coordenador", curso.getNomeCoordenador());
    }
}