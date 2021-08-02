package exercicioRelampagoSurpresa4;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Professor professor;
    private List<Aluno> alunos;
    private Disciplina disciplina;

    public Turma(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("Disciplina obrigatória");
        }
        this.disciplina = disciplina;
        this.alunos = new ArrayList<Aluno>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("Disciplina obrigatória");
        }
        this.disciplina = disciplina;
    }

    public String getNomeDisciplina() {
        if (this.disciplina == null) {
            throw new NullPointerException("Turma sem disciplina");
        }
        return this.disciplina.getNome();
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<String> getNomesAlunos() {
        List<String> lista = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            lista.add(aluno.nome);
        }
        return lista;
    }

    public String getNomeProfessor() {
        if (this.professor == null) {
           return "Turma sem professor";
        }
        return this.professor.getNome();
    }

    public boolean verificarAlunoTurma(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public boolean excluirAluno(Aluno aluno) {
        return this.alunos.remove(aluno);
    }

}
