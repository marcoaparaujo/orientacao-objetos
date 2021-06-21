package funcionario;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FolhaPagamentoTest {

    @Test
    void calcularTotalFolhaPagamento() {

        FuncionarioMensalista funcionario1 = new FuncionarioMensalista();
        funcionario1.setValorMes(1000.0f);

        FuncionarioDiarista funcionario2 = new FuncionarioDiarista();
        funcionario2.setValorDia(100.0f);
        funcionario2.setNumDias(20);

        FuncionarioHorista funcionario3 = new FuncionarioHorista();
        funcionario3.setValorHora(30.0f);
        funcionario3.setNumDias(10);
        funcionario3.setNumHorasDia(10);

        List<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(funcionario1);
        lista.add(funcionario2);
        lista.add(funcionario3);

        assertEquals(6000.0f, FolhaPagamento.calcularTotalFolhaPagamento(lista));
    }
}