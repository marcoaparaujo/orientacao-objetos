package funcionario;

public abstract class Funcionario {

    private String nome;
    protected float valorFixo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }

    public abstract float calcularSalario();
}
