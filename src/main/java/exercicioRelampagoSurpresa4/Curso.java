package exercicioRelampagoSurpresa4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Turma> turmas;
    private List<Aluno> alunos;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
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

    public List<String> getNomesAlunosCurso() {
        List<String> alunos = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            alunos.add(aluno.getNome());
        }
        return alunos;
    }

    public List<String> getNomesDisciplinasTurmas() {
        List<String> disciplinas = new ArrayList<String>();
        for (Turma turma : this.turmas) {
            disciplinas.add(turma.getNomeDisciplina());
        }
        return disciplinas;
    }

    public boolean verificarAlunoCurso(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public boolean verificarTurmaCurso(Turma turma) {
        return this.turmas.contains(turma);
    }

    public boolean excluirTurma(Turma turma) {
        return this.turmas.remove(turma);
    }

    public boolean excluirAluno(Aluno aluno) {
        return this.alunos.remove(aluno);
    }

    public boolean excluirAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return this.alunos.remove(aluno);
            }
        }
        return false;
    }

    public Aluno obterAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
