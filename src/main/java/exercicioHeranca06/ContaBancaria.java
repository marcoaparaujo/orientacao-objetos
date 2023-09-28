package exercicioHeranca06;

public abstract class ContaBancaria {

    private int numeroConta;
    private float saldo;
    private String titular;

    public ContaBancaria() {
        this.saldo = 0.0f;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public abstract void depositar(float valorDeposito);

    public void sacar(float valorSaque) {
        if (valorSaque > this.saldo) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.saldo = this.saldo - valorSaque;
    }

    public abstract void calcularJuros();

}
