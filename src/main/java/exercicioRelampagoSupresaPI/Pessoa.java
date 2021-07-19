package exercicioRelampagoSupresaPI;

public class Pessoa {

    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public Pessoa(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        if (this.escolaridade != null) {
            this.escolaridade = escolaridade;
        }
    }

    public Cidade getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        if (naturalidade != null) {
            this.naturalidade = naturalidade;
        }
    }

    public String getDescricaoEscolaridade() {
        if (this.escolaridade == null) {
            throw new NullPointerException("Pessoa sem escolaridade");
        }
        return this.escolaridade.getDescricao();
    }

    public String getEstadoCidade() {
        if (this.naturalidade == null){
            throw new NullPointerException("Pessoa sem naturalidade");
        }
        return this.naturalidade.getNomeEstado();
    }

    public String getNomeCidade() {
        if (this.naturalidade == null){
            throw new NullPointerException("Pessoa sem naturalidade");
        }
        return this.naturalidade.getNome();
    }

}
