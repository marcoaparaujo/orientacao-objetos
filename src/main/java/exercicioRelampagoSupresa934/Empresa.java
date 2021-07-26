package exercicioRelampagoSupresa934;

public class Empresa {

    private Grupo grupo;
    private Funcionario diretor;

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getNomePaisEmpresa() {
        if (this.grupo == null) {
            return "Empresa sem grupo";
        }
        return this.grupo.getNomePais();
    }

    public String getNomeDiretor() {
        if (this.diretor == null) {
            return "Empresa sem diretor";
        }
        return this.diretor.getNome();
    }
}
