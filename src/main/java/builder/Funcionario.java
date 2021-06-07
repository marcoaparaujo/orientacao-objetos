package builder;

public class Funcionario {

    private String nome;
    private float salarioBruto;
    private float totalAcrescimos;
    private float totalDescontos;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public Funcionario setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
        return this;
    }

    public float getTotalAcrescimos() {
        return totalAcrescimos;
    }

    public Funcionario setTotalAcrescimos(float totalAcrescimos) {
        this.totalAcrescimos = totalAcrescimos;
        return this;
    }

    public float getTotalDescontos() {
        return totalDescontos;
    }

    public Funcionario setTotalDescontos(float totalDescontos) {
        this.totalDescontos = totalDescontos;
        return this;
    }

    public float calcularSalarioLiquido() {
        return this.salarioBruto + this.totalAcrescimos - this.totalDescontos;
    }

}
