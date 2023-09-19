package imc;

public abstract class Pessoa {
    private float peso;
    private float altura;

    public float getPeso ()
    {
        return peso;
    }

    public void setPeso (float peso)
    {
        if (peso <= 0.0f) {
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }

    public float getAltura ()
    {
        return altura;
    }

    public void setAltura (float altura)
    {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public float calcImc() {
        return this.peso / (this.altura * this.altura);
    }

    public float calcImc(int fator) {
        return this.calcImc() * fator;
    }

    public abstract String calcularImc();



}

