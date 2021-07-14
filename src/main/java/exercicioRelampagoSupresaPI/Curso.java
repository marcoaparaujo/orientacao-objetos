package exercicioRelampagoSupresaPI;

public class Curso {

    private Professor coordenador;
    private Escola escolaCurso;

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

    public String getDescricaoEscolaridadeCoordenador() {
        return coordenador.getDescricaoEscolaridade();
    }

    public String retornaEstadoCurso() {
        if ( this.escolaCurso == null) {
            throw new NullPointerException("Escola não informada!");
        }
        return this.escolaCurso.retornaEstadoEscola();
    }
}
