package exercicio;

public class AlunoGraduacao extends Aluno {

    public String emitirDiploma() {
        Diploma diploma = new DiplomaGraduacao();
        return diploma.emitirDiploma(this);
    }
}
