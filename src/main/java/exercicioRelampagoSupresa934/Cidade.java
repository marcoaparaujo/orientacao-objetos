package exercicioRelampagoSupresa934;

public class Cidade {

    private Estado estado;

    public Cidade(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado obrigatorio");
        }
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado obrigatorio");
        }
        this.estado = estado;
    }

    public String getNomeEstado() {
        if (this.estado == null) {
            throw new NullPointerException("Estado obrigatorio");
        }
        return this.estado.getNome();
    }
}
