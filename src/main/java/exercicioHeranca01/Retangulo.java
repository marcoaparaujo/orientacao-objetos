package exercicioHeranca01;

public class Retangulo extends FormaGeometrica{

    private float base;
    private float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea() {
        return this.base * this.altura;
    }

    public float calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
}
