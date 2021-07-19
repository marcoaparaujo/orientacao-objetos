package exercicioRelampagoSupresaPI;

public class Cidade {

    private Estado estado;
    private String nome;

    public Cidade (String nomeCidade, Estado estado) {
        this.nome = nomeCidade;
        this.estado=estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (this.estado != null) {
            this.estado = estado;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEstado() {
        if (this.estado == null) {
            throw new NullPointerException("Cidade sem estado");
        }
        return this.estado.getNome();
    }

}
