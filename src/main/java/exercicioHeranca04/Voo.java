package exercicioHeranca04;

public abstract class Voo {

    private String origem;
    private String destino;
    private float distancia;
    private String dataVoo;
    private float fatorPreco;


    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }

    public float getFatorPreco() {
        return fatorPreco;
    }

    public void setFatorPreco(float fatorPreco) {
        this.fatorPreco = fatorPreco;
    }

    public abstract float getFatorConversaoMoeda();

    public float calcularPreco() {
        return this.getDistancia() * this.getFatorPreco() * this.getFatorConversaoMoeda();
    }
}
