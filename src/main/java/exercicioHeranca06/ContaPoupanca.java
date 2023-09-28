package exercicioHeranca06;

public class ContaPoupanca extends ContaBancaria {

    private float taxaJuros;

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void depositar(float valorDeposito) {
        if (valorDeposito <= 0.0f) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.setSaldo(this.getSaldo() + valorDeposito);
    }


    public void calcularJuros() {
        float juros = this.getSaldo() * this.taxaJuros / 100;
        this.setSaldo(this.getSaldo() + juros);
        this.taxaJuros = 0.0f;
    }
}
