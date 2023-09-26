package exercicioHeranca01;

public class Circulo extends FormaGeometrica {

    private float raio;

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float calcularArea() {
        return this.raio * this.raio * 3.1416f;
    }

    public float calcularPerimetro() {
        return 2 * 3.1416f * this.raio;
    }
}
