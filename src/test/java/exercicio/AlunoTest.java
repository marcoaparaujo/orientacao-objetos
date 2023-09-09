package exercicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Curso curso;

    @BeforeEach
    void setUp() {
        curso = new Curso();
        curso.setNome("Engenharia de Software");
    }

    @Test
    void deveEmitirDiplomaGraduacaoAluno() {
        Aluno aluno = new AlunoGraduacao(1, "Ana", curso);
        assertEquals("Certificamos que Ana concluiu o curso de graduacao Engenharia de Software", aluno.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaPosGraduacaoAluno() {
        Aluno aluno = new AlunoPosGraduacao(1, "Ana", curso);
        assertEquals("Certificamos que Ana concluiu o curso de pós-graduacao Engenharia de Software", aluno.emitirDiploma());
    }

    @Test
    void deveValidarCursoNulo() {
        try {
            Aluno aluno = new AlunoGraduacao(1, "Ana", null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Curso nulo", e.getMessage());
        }
    }

}