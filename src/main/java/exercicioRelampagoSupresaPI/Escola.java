package exercicioRelampagoSupresaPI;

public class Escola {
    private Professor diretor;
    private Cidade cidadeEscola;



    public Escola(Professor diretor) {
        if (diretor == null) {
            throw new IllegalArgumentException("diretor eh obrigatorio!");
        }
        else {
            this.diretor = diretor;
        }
    }

    public Escola() {

    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if (diretor != null) {
            this.diretor = diretor;
        }
    }

    public Cidade getCidadeEscola() {
        return cidadeEscola;
    }

    public void setCidadeEscola(Cidade cidadeEscola) {
        this.cidadeEscola = cidadeEscola;
    }

    public String retornaEscolaridadeDiretor() {
        return diretor.getDescricaoEscolaridade();
    }

    public String retornaEstadoEscola() {
        if ( this.cidadeEscola == null) {
            throw new NullPointerException("Cidade não informada!");
        }
        return this.cidadeEscola.retornaEstadoCidade();
    }

    public String getNomeDiretor(){
        if(this.diretor == null){
            throw new NullPointerException("Escola sem diretor");
        }
        return this.diretor.getNome();
    }
}
