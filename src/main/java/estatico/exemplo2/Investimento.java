package estatico.exemplo2;

public class Investimento {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float converterParaDolar() {
        return this.valor * CotacaoDolar.getCotacaoDolar();
    }

}
