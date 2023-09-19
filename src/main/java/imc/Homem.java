package imc;

public class Homem extends Pessoa {


    public String calcularImc () {
        String resposta;
        float imc = this.calcImc(1);

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

        return resposta;
    }
}
