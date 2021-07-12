package exercicioRelampagoSupresaPI;

public class Pessoa {

    private Escolaridade escolaridade;

    public Pessoa(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        if (escolaridade != null) {
            this.escolaridade = escolaridade;
        }
    }

    public String getDescricaoEscolaridade() {
        return escolaridade.getDescricao();
    }
}
