package salario;

public class FuncionarioDiarista implements Funcionario {

    private float valorDia;
    private int numDias;

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valor) {
        this.valorDia = valor;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public float calcularSalario() {
        return this.numDias * this.valorDia;
    }
}
