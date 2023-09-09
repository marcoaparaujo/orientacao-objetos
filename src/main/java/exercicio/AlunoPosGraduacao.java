package exercicio;

public class AlunoPosGraduacao extends Aluno {

    public String emitirDiploma() {
        Diploma diploma = new DiplomaPosGraduacao();
        return diploma.emitirDiploma(this);
    }
}
