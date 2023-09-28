package exercicioHeranca06;

public class ContaCorrente extends ContaBancaria {

    private float taxaManutencao;

    public float getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public void depositar(float valorDeposito) {
        if (valorDeposito <= 0.0f) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.setSaldo(this.getSaldo() + valorDeposito - this.taxaManutencao);
        this.taxaManutencao = 0.0f;
    }

    public void calcularJuros() {
    }


}
