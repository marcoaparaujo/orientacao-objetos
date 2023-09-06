package imc;

public class Pessoa {
    private String sexo;
    private float peso;
    private float altura;

    public String getSexo ()
    {
        return this.sexo;
    }

    public void setSexo (String sexo)
    {
        if (!(sexo.equals("F") || sexo.equals("M"))) {
            throw new IllegalArgumentException("Sexo invalido");
        }
        this.sexo = sexo;
    }

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

    public String calcularImc () {

        String resposta;
        float imc = this.peso / (this.altura * this.altura);
        if (sexo.equals("F")) {
            if (imc < 19.1f) {
                resposta = "abaixo do peso";
            } else {
                if (imc < 25.8f) {
                    resposta = "no peso normal";
                } else {
                    if (imc < 27.3f) {
                        resposta = "marginalmente acima do peso";
                    } else {
                        if (imc < 32.3f) {
                            resposta = "acima do peso ideal";
                        } else {
                            resposta = "obeso";
                        }
                    }
                }
            }
        }
        else {
            if (imc < 20.7f) {
                resposta = "abaixo do peso";
            }
            else {
                if (imc < 26.4f) {
                    resposta = "no peso normal";
                }
                else {
                    if (imc < 27.8f) {
                        resposta = "marginalmente acima do peso";
                    }
                    else {
                        if (imc < 31.1f) {
                            resposta = "acima do peso ideal";
                        }
                        else {
                            resposta = "obeso";
                        }
                    }
                }
            }
        }
        return resposta;
    }
}

