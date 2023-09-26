package exercicioHeranca02;

public class FuncionarioComum extends Funcionario {

    public float calcularPagamento() {
        return this.getSalarioMensal();
    }
}