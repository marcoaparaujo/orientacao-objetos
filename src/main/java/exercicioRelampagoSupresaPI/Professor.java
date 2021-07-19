package exercicioRelampagoSupresaPI;

public class Professor extends Pessoa {

    private Curso contratacao;

    public Professor(Escolaridade escolaridade) {
        super(escolaridade);
    }

    public Curso getContratacao() {
        return contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getTipoEnsinoContratadoParaLecionar () {
        if (this.contratacao == null) {
            throw new NullPointerException("Sem contratação");
        }
        return this.contratacao.getNomeTipoEnsino();
    }

    public String getNomeDiretorEscola(){
        if (this.contratacao == null) {
            throw new NullPointerException("Sem contratação");
        }
        return this.contratacao.getNomeDiretor();
    }
}
