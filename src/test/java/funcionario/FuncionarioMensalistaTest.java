package funcionario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioMensalistaTest {

    @Test
    void deveRetornarNomeFuncionario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setNome("Marco");
        assertEquals("Marco", funcionarioMensalista.getNome());
    }

    @Test
    void deveCalcularSalario() {
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista();
        funcionarioMensalista.setValorFixo(100.0f);
        funcionarioMensalista.setValorMes(14000.0f);
        assertEquals(14100.0f, funcionarioMensalista.calcularSalario());
    }


}