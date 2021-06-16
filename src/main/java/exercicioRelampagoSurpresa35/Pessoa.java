package exercicioRelampagoSurpresa35;

public abstract class Pessoa {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getInfo();
}
