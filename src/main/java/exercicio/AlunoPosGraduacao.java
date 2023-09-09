package exercicio;

public class AlunoPosGraduacao extends Aluno {

    public AlunoPosGraduacao(int matricula, String nome, Curso curso) {
        super(matricula, nome, curso);
    }

    public String emitirDiploma() {
        Diploma diploma = new DiplomaPosGraduacao();
        return diploma.emitirDiploma(this);
    }
}
