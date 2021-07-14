package exercicioRelampagoSupresaPI;

public class Cidade {

    private Estado estado;
    private String nomeCidade;

    public Cidade (String nomeCidade, Estado estado) {
        this.nomeCidade = nomeCidade;
        this.estado=estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getNomeEstado() {
        return this.estado.getNomeEstado();
    }

    public String retornaEstadoCidade() {
        if ( this.estado == null) {
            throw new NullPointerException("Estado não informado!");
        }
        return this.estado.getNomeEstado();
    }
}
