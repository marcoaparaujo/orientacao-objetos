package exercicioRelampagoSurpresa35;

public class Professor extends Pessoa {

    private String titulacaoMaxima;

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public String getInfo() {
        return this.nome + " - " + this.titulacaoMaxima;
    }
}
