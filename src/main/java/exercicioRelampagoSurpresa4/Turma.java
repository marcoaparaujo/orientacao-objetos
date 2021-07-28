package exercicioRelampagoSurpresa4;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Professor professor;
    private List<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
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

}
