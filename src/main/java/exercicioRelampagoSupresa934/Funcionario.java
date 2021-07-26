package exercicioRelampagoSupresa934;

public class Funcionario {

    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Funcionario(Departamento departamento) {
        if (departamento == null) {
            throw new IllegalArgumentException("Departamento obrigatorio");
        }
        this.alocacao = departamento;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        if (alocacao == null) {
            throw new IllegalArgumentException("Departamento obrigatorio");
        }
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNomeEscolaridadeFuncionario() {
        if (this.escolaridade == null) {
            return "Funcionario sem escolaridade";
        }
        return this.escolaridade.getNome();
    }

    public String getNomePaisAlocacaoFuncionario() {
        if (this.alocacao == null) {
            throw new NullPointerException("Departamento obrigatorio");
        }
        return this.alocacao.getNomePaisDepartamento();
    }

    public String getNomeEstadoFilialCoordenacao() {
        if (this.coordenacao == null) {
            return "Funcionario nao coordena filial";
        }
        return this.coordenacao.getNomeEstadoFilial();
    }

}
