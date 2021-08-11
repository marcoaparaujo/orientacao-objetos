package exercicioRelampagoSupresaPI;

public class Curso {

    private Professor coordenador;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Curso(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public Curso() {
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if (coordenador != null) {
            this.coordenador = coordenador;
        }
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getNomeTipoEnsino () {
        if (this.tipoEnsino == null) {
            throw new NullPointerException("relacionamentoBidirecional1para1.Curso sem tipo de ensino");
        }
        return this.tipoEnsino.getNome();
    }

    public String getDescricaoEscolaridadeCoordenador() {
        if (this.coordenador == null) {
            throw new NullPointerException("relacionamentoBidirecional1para1.Curso sem coordenador");
        }
        return coordenador.getDescricaoEscolaridade();
    }

    public String retornaEstadoCurso() {
        if (this.escola == null) {
            throw new NullPointerException("relacionamentoBidirecional1para1.Curso sem escola");
        }
        return this.escola.getEstadoEscola();
    }

    public String getNomeCoordenadorCurso() {
        if (this.coordenador == null) {
            throw new NullPointerException("relacionamentoBidirecional1para1.Curso sem coordenador");
        }
        return this.coordenador.getNome();
    }

    public String getNomeDiretor(){
        if (this.escola == null){
            throw new NullPointerException("relacionamentoBidirecional1para1.Curso sem escola");
        }
        return this.escola.getNomeDiretor();
    }
}
