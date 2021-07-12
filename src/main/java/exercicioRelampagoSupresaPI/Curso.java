package exercicioRelampagoSupresaPI;

public class Curso {

    private Professor coordenador;

    public Curso(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if (coordenador != null) {
            this.coordenador = coordenador;
        }
    }

    public String getDescricaoEscolaridadeCoordenador() {
        return coordenador.getDescricaoEscolaridade();
    }
}
