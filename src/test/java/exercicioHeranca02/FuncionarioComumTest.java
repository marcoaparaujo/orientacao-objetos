package exercicioHeranca02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularPagamento() {
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setSalarioMensal(1000.0f);
        assertEquals(1000.0f, funcionario.calcularPagamento());
    }

}