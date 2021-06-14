package funcionario;

public class FuncionarioMensalista extends Funcionario {

    private float valorMes;

    public float getValorMes() {
        return valorMes;
    }

    public void setValorMes(float valorMes) {
        this.valorMes = valorMes;
    }

    public float calcularSalario() {
        return this.valorMes;
    }
}
