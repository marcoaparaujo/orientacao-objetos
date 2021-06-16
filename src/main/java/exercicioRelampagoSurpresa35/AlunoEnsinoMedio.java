package exercicioRelampagoSurpresa35;

public class AlunoEnsinoMedio extends Aluno {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 6) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
