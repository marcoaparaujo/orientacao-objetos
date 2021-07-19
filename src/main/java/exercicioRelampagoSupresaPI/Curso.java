package exercicioRelampagoSupresaPI;

public class Curso {

    private Professor coordenador;
    private Escola escolaCurso;
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

    public Escola getEscolaCurso() {
        return escolaCurso;
    }

    public void setEscolaCurso(Escola escolaCurso) {
        this.escolaCurso = escolaCurso;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getNomeTipoEnsino () {
        if (this.tipoEnsino == null) {
            throw new NullPointerException("Sem tipo de ensino");
        }
        return this.tipoEnsino.getNomeTipoEnsino();
    }

    public String getDescricaoEscolaridadeCoordenador() {
        return coordenador.getDescricaoEscolaridade();
    }

    public String retornaEstadoCurso() {
        if ( this.escolaCurso == null) {
            throw new NullPointerException("Escola não informada!");
        }
        return this.escolaCurso.retornaEstadoEscola();
    }

    public String getNomeCoordenadorCurso() {
        if ( this.coordenador == null) {
            throw new NullPointerException("Curso sem coordenador");
        }
        return this.coordenador.getNome();
    }
}
