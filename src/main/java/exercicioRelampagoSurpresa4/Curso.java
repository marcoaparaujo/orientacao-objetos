package exercicioRelampagoSurpresa4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Turma> turmas;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<String> getNomesProfessores() {
        List<String> professores = new ArrayList<String>();
        for (Turma turma : this.turmas) {
            if (!turma.getNomeProfessor().equals("Turma sem professor")) {
                professores.add(turma.getNomeProfessor());
            }
        }
        return professores;
    }

    public List<String> getNomesAlunosTurmas() {
        List<String> alunos = new ArrayList<String>();
        for (Turma turma : turmas) {
            alunos.addAll(turma.getNomesAlunos());
        }
        return alunos;
    }

    public List<String> getNomesAlunosTurmasDistintos() {
        List<String> alunos = new ArrayList<String>();
        for (Turma turma : turmas) {
            for (String aluno : turma.getNomesAlunos()) {
                if (!alunos.contains(aluno)) {
                    alunos.add(aluno);
                }
            }
        }
        return alunos;
    }

}
