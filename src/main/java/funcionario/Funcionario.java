package funcionario;

public abstract class Funcionario {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract float calcularSalario();
}
