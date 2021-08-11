package relacionamentoBidirecional1para1;

public class Professor {

    private String nome;
    private Curso cursoCoordenacao;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCursoCoordenacao() {
        return cursoCoordenacao;
    }

    public void setCursoCoordenacao(Curso cursoCoordenacao) {
        if (this.cursoCoordenacao != cursoCoordenacao) {
            if (this.cursoCoordenacao != null) {
                this.cursoCoordenacao.setNullCoordenador();
            }
            this.cursoCoordenacao = cursoCoordenacao;
            if (this.cursoCoordenacao != null && this.cursoCoordenacao.getCoordenador() != this) {
                this.cursoCoordenacao.setCoordenador(this);
            }
        }
    }

    public void setNullCursoCoordenacao() {
        this.cursoCoordenacao = null;
    }

    public String getNomeCursoCoordenacao() {
        if (this.cursoCoordenacao == null) {
            return "Professor não coordena curso";
        }
        else {
            return cursoCoordenacao.getNome();
        }
    }

}
