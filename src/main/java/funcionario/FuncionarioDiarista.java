package funcionario;

public class FuncionarioDiarista extends Funcionario {

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

    @Override
    public float calcularSalario() {
        return this.numDias * this.valorDia;
    }
}
