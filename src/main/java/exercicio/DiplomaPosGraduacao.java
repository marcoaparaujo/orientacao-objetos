package exercicio;

public class DiplomaPosGraduacao implements Diploma {

    public String emitirDiploma(Aluno aluno) {
        return "Certificamos que " + aluno.getNome() + " concluiu o curso de pós-graduacao " + aluno.getNomeCurso();
    }
}
