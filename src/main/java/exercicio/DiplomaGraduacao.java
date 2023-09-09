package exercicio;

public class DiplomaGraduacao implements Diploma {

    public String emitirDiploma(Aluno aluno) {
        return "Certificamos que " + aluno.getNome() + " concluiu o curso de graduacao";
    }
}
