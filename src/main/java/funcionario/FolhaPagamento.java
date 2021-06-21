package funcionario;

import java.util.List;

public class FolhaPagamento {

    public static float calcularTotalFolhaPagamento(List<Funcionario> funcionarios) {
        float total = 0.0f;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

}
