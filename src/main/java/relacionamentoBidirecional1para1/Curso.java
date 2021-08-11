package relacionamentoBidirecional1para1;

public class Curso {

    private String nome;
    private Professor coordenador;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if (this.coordenador != coordenador) {
            if (this.coordenador != null) {
                this.coordenador.setNullCursoCoordenacao();
            }
            this.coordenador = coordenador;
            if (this.coordenador != null && this.coordenador.getCursoCoordenacao() != this) {
                this.coordenador.setCursoCoordenacao(this);
            }
        }
    }

    public void setNullCoordenador() {
        this.coordenador = null;
    }

    public String getNomeCoordenador() {
        if (this.coordenador == null) {
            return "Curso sem coordenador";
        }
        else {
            return coordenador.getNome();
        }
    }
}
