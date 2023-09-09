package exercicio;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(int matricula, String nome, Curso curso) {
        super(matricula, nome, curso);
    }

    public String emitirDiploma() {
        Diploma diploma = new DiplomaGraduacao();
        return diploma.emitirDiploma(this);
    }
}
