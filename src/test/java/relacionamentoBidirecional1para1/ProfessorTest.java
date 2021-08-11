package relacionamentoBidirecional1para1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveVerificarRelacionamentoCursoCoordenador() {
        Curso curso = new Curso("Ciência da Computação");
        Professor professor = new Professor("João");

        professor.setCursoCoordenacao(curso);

        assertEquals("João", curso.getNomeCoordenador());
        assertEquals("Ciência da Computação", professor.getNomeCursoCoordenacao());
    }

    @Test
    void deveVerificarMudancaCoordenacao() {
        Professor professor = new Professor("João");
        Curso curso1 = new Curso("Ciência da Computação");
        professor.setCursoCoordenacao(curso1);

        Curso curso2 = new Curso("Sistemas de Informação");
        professor.setCursoCoordenacao(curso2);

        assertEquals("Sistemas de Informação", professor.getNomeCursoCoordenacao());
        assertEquals("Curso sem coordenador", curso1.getNomeCoordenador());
        assertEquals("João", curso2.getNomeCoordenador());
    }

    @Test
    void deveVerificarProfessorNaoCoordenador() {
        Professor professor = new Professor("João");
        professor.setCursoCoordenacao(null);

        assertEquals("Professor não coordena curso", professor.getNomeCursoCoordenacao());
    }

    @Test
    void deveVerificarProfessorDeixarCoordenacao() {
        Professor professor = new Professor("João");
        Curso curso = new Curso("Ciência da Computação");
        professor.setCursoCoordenacao(curso);

        professor.setCursoCoordenacao(null);

        assertEquals("Professor não coordena curso", professor.getNomeCursoCoordenacao());
        assertEquals("Curso sem coordenador", curso.getNomeCoordenador());
    }
}