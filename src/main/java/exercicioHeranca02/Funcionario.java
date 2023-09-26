package exercicioHeranca02;

public abstract class Funcionario {

    private float salarioMensal;

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public abstract float calcularPagamento();
}
