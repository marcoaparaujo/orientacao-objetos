package exercicioRelampagoSupresa934;

public class Grupo {

    private Pais sede;
    private Funcionario presidente;

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getNomeEscolaridadePresidente() {
        if (this.presidente == null) {
            return "Grupo sem presidente";
        }
        return this.presidente.getNomeEscolaridadeFuncionario();
    }

    public String getNomePais() {
        if (this.sede == null) {
            return "Grupo sem país";
        }
        return this.sede.getNome();
    }
}
