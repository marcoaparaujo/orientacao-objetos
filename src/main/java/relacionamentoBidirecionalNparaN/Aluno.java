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
}
