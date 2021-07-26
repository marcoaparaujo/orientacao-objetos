package exercicioRelampagoSupresa934;

public class Departamento {

    private Empresa empresa;
    private Funcionario chefe;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String getNomePaisDepartamento() {
        if (this.empresa == null) {
            return "Departamento sem empresa";
        }
        return this.empresa.getNomePaisEmpresa();
    }

    public String getNomeEscolaridadeChefe() {
        if (this.chefe == null) {
            return "Departamento sem chefe";
        }
        return this.chefe.getNomeEscolaridadeFuncionario();
    }
}
