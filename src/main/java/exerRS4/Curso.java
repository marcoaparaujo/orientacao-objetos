package exerRS4;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private List<Aluno> alunos;
    private List<Turma> turmas;

    public Curso() {
        this.alunos = new ArrayList<Aluno>();
        this.turmas = new ArrayList<Turma>();
    }

    public void abrirTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<String> getNomesProfessores() {
        List<String> lista = new ArrayList<String>();
        for (Turma turma : this.turmas) {
            if (!lista.contains(turma.getNomeProfessor())) {
                lista.add(turma.getNomeProfessor());
            }
        }
        return lista;
    }

    public List<String> getNomesAlunosTurmas() {
        List<String> lista = new ArrayList<String>();
        for (Turma turma : this.turmas) {
            for (String nome : turma.getNomesAlunos()) {
                if (!lista.contains(nome)) {
                    lista.add(nome);
                }
            }
        }
        return lista;
    }

    public List<String> getNomesAlunos() {
        List<String> lista = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            lista.add(aluno.getNome());
        }
        return lista;
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<String> getNomesDisciplinas() {
        List<String> lista = new ArrayList<String>();
        for (Turma turma : this.turmas) {
            if (!lista.contains(turma.getNomeDisciplina())) {
                lista.add(turma.getNomeDisciplina());
            }
        }
        return lista;
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public boolean verificarTurma(Turma turma) {
        return this.turmas.contains(turma);
    }

    public void excluirTurma(Turma turma) {
        this.turmas.remove(turma);
    }

    public void excluirAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

}
