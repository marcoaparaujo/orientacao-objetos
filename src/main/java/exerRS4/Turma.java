package exerRS4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Turma {

    private List<Aluno> alunos;
    private Professor professor;
    private Disciplina disciplina;

    public Turma(Disciplina disciplina, Professor professor) {
        this.alunos = new ArrayList<Aluno>();
        this.disciplina = disciplina;
        this.setProfessor(professor);
        this.setDisciplina(disciplina);
    }

    public String getNomeProfessor() {
        return this.professor.getNome();
    }

    public String getNomeDisciplina() {
        return this.disciplina.getNome();
    }

    public void setProfessor(Professor professor) {
        if (professor == null) {
            throw new IllegalArgumentException("Professor invalido");
        }
        this.professor = professor;
    }

    public void setDisciplina(Disciplina disciplina) {
        if (disciplina == null) {
            throw new IllegalArgumentException("Disciplina invalida");
        }
        this.disciplina = disciplina;
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<String> getNomesAlunos() {
        List<String> lista = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            lista.add(aluno.getNome());
        }
        return lista;
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public void excluirAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

}
