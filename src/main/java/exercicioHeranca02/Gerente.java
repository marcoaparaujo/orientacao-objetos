package exercicioHeranca02;

public class Gerente extends Funcionario {

    private float bonus;

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float calcularPagamento() {
        return this.getSalarioMensal() + this.bonus;
    }
}
