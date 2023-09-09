package exercicio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveEmitirDiplomaGraduacaoAluno() {
        Aluno aluno = new AlunoGraduacao();
        aluno.setNome("Ana");
        assertEquals("Certificamos que Ana concluiu o curso de graduacao", aluno.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaPosGraduacaoAluno() {
        Aluno aluno = new AlunoPosGraduacao();
        aluno.setNome("Ana");
        assertEquals("Certificamos que Ana concluiu o curso de pós-graduacao", aluno.emitirDiploma());
    }

}