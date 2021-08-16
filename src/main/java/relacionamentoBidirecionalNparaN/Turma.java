package relacionamentoBidirecionalNparaN;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int ano;
    private int semestre;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(int ano, int semestre, Disciplina disciplina) {
        this.ano = ano;
        this.semestre = semestre;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<Aluno>();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void matricular(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno deve ser informado");
        }
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
        if (!aluno.verificarMatriculaTurma(this)) {
            aluno.matricular(this);
        }
    }

    public void desmatricular(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Aluno deve ser informado");
        }
        if (this.alunos.contains(aluno)) {
            this.alunos.remove(aluno);
        }
        if (aluno.verificarMatriculaTurma(this)) {
            aluno.desmatricular(this);
        }
    }

    public boolean verificarMatriculaAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
