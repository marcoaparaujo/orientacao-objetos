package funcionario;

public class FuncionarioMensalista extends Funcionario {

    private float valorMes;

    public float getValorMes() {
        return valorMes;
    }

    public void setValorMes(float valor) {
        this.valorMes = valor;
    }

    @Override
    public float calcularSalario() {
        return this.valorMes;
    }

}
