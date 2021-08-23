package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioHoristaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setNome("Marco");
        assertEquals("Marco", funcionarioHorista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        funcionarioHorista.setValorHora(100.0f);
        funcionarioHorista.setNumDias(20);
        funcionarioHorista.setNumHorasDia(10);
        assertEquals(20000.0f, funcionarioHorista.calcularSalario());
    }

    @Test
    void deveCalcularValeRefeicao() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        assertEquals(600.0f, funcionarioHorista.calcularValeRefeicao());
    }

    @Test
    void deveCalcularValeRefeicaoComAumento() {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista();
        assertEquals(660.0f, funcionarioHorista.calcularValeRefeicao(10.0f));
    }

}