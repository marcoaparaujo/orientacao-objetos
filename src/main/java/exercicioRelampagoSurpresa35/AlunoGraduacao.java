package exercicioRelampagoSurpresa35;

public class AlunoGraduacao extends Aluno {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}
