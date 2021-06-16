package exercicioRelampagoSurpresa35;

public class AlunoGraduacao extends Aluno {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}
