package salario;

public class FuncionarioMensalista implements Funcionario {

    private float valorMes;

    public float getValorMes() {
        return valorMes;
    }

    public void setValorMes(float valor) {
        this.valorMes = valor;
    }

    public float calcularSalario() {
        return this.getValorMes();
    }

}
