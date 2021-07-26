package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public boolean verificarFuncionario(Funcionario funcionario) {
        return this.funcionarios.contains(funcionario);
    }

    public int getNumeroFuncionarios() {
        return this.funcionarios.size();
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public Funcionario getFuncionario(int indice) {
        return this.funcionarios.get(indice);
    }

    public boolean verificarListaFuncionariosVazia() {
        return this.funcionarios.isEmpty();
    }

}
