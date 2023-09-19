package imc;

public class Mulher extends Pessoa {

    public String calcularImc () {
        String resposta;
        float imc = this.calcImc(1);
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
        return resposta;
    }
}
