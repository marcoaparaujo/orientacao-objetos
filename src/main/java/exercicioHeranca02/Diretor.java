package exercicioHeranca02;

public class Diretor extends Funcionario {

    private float percentualParticipacao;
    private float lucroEmpresa;

    public float getPercentualParticipacao() {
        return percentualParticipacao;
    }

    public void setPercentualParticipacao(float percentualParticipacao) {
        this.percentualParticipacao = percentualParticipacao;
    }

    public float getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(float lucroEmpresa) {
        this.lucroEmpresa = lucroEmpresa;
    }

    public float calcularPagamento() {
        return this.getSalarioMensal() + (this.lucroEmpresa * (this.percentualParticipacao / 100));
    }
}
