package exercicio3;

public class AlunoGraduacao extends Aluno {

    public boolean verificarAprovacao() {
        return this.calcularMedia() >= 7;
    }
}
