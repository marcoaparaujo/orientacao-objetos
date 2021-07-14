package exercicioRelampagoSupresaPI;

public class Escola {
    private Professor diretor;

    public Escola(Professor diretor) {
        if (diretor == null) {
            throw new IllegalArgumentException("diretor eh obrigatorio!");
        }
        else {
            this.diretor = diretor;
        }
    }

    public Professor getDiretor() {
        return diretor;
    }

    public void setDiretor(Professor diretor) {
        if (diretor != null) {
            this.diretor = diretor;
        }
    }

    public String retornaEscolaridadeDiretor() {
        return diretor.getDescricaoEscolaridade();
    }
}
