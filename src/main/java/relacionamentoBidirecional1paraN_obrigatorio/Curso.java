package relacionamentoBidirecional1paraN_obrigatorio;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;

    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public void matricularAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
        aluno.matricular(this);
    }

    public void transferirAluno(Aluno aluno, Curso curso) {
        this.alunos.remove(aluno);
        curso.matricularAluno(aluno);
    }

    public boolean verificarAlunoMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
