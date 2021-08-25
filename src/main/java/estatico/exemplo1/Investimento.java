package estatico.exemplo1;

public class Investimento {

    private float valor;
    private static float cotacaoDolar;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public static float getCotacaoDolar() {
        return cotacaoDolar;
    }

    public static void setCotacaoDolar(float cotacaoDolarDia) {
        cotacaoDolar = cotacaoDolarDia;
    }

    public float converterParaDolar() {
        return this.valor * cotacaoDolar;
    }

}
