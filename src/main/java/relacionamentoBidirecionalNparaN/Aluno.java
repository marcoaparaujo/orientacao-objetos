package relacionamentoBidirecionalNparaN;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private int matricula;
    private String nome;
    private List<Turma> turmas;

    public Aluno(String nome) {
        this.nome = nome;
        this.turmas = new ArrayList<Turma>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void matricular(Turma turma) {
        if (turma == null) {
            throw new NullPointerException("Turma deve ser informada");
        }
        if (!this.turmas.contains(turma)) {
            this.turmas.add(turma);
        }
        if (!turma.verificarMatriculaAluno(this)) {
            turma.matricular(this);
        }
    }

    public void desmatricular(Turma turma) {
        if (turma == null) {
            throw new NullPointerException("Turma deve ser informada");
        }
        if (this.turmas.contains(turma)) {
            this.turmas.remove(turma);
        }
        if (turma.verificarMatriculaAluno(this)) {
            turma.desmatricular(this);
        }
    }

    public boolean verificarMatriculaTurma(Turma turma) {
        return this.turmas.contains(turma);
    }
}
