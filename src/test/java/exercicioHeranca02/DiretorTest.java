package exercicioHeranca02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularPagamento() {
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(1000.0f);
        diretor.setLucroEmpresa(1000000.0f);
        diretor.setPercentualParticipacao(1.0f);
        assertEquals(11000.0f, diretor.calcularPagamento());

    }

}