package aprovacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    public void deveReprovarAlunoPorInfrequencia() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(74);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    public void deveAprovarAlunoPorMedia() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75);
        aluno.setNotaAvaliacao1(7.0f);
        aluno.setNotaAvaliacao2(7.0f);
        assertEquals(true, aluno.verificarAprovacao());
    }

    @Test
    public void deveReprovarAlunoPorMedia() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75);
        aluno.setNotaAvaliacao1(2.9f);
        aluno.setNotaAvaliacao2(3.0f);
        assertEquals(false, aluno.verificarAprovacao());
    }

    @Test
    public void deveReprovarAlunoAvaliacaoFinal() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75);
        aluno.setNotaAvaliacao1(3.0f);
        aluno.setNotaAvaliacao2(3.0f);
        aluno.setNotaAvaliacaoFinal(6.9f);
        assertEquals(false, aluno.verificarAprovacao());
    }


    @Test
    public void deveAprovarAlunoAvaliacaoFinal() {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(75);
        aluno.setNotaAvaliacao1(3.0f);
        aluno.setNotaAvaliacao2(3.0f);
        aluno.setNotaAvaliacaoFinal(7.0f);
        assertEquals(true, aluno.verificarAprovacao());
    }
}