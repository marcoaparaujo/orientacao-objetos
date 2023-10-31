package associacao;

import java.util.ArrayList;

public class Turma {

    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(Disciplina disciplina) {
        this.alunos = new ArrayList<Aluno>();
        this.setDisciplina(disciplina);
    }

    public Disciplina getDisciplina() {
        return disciplina;
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

    public void desmatricular(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public boolean verificarMatricula(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public int getNumeroAlunos() {
        return this.alunos.size();
    }
}
