package relacionamentoBidirecional1paraN_obrigatorio;

public class Aluno {

    private String nome;
    private Curso curso;

    public Aluno(String nome, Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso obrigatório");
        }
        this.nome = nome;
        this.curso = curso;
        curso.matricularAluno(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void matricular(Curso curso) {
        if (curso == null) {
            throw new NullPointerException("Curso obrigatório");
        }
        if (this.curso != curso) {
            Curso cursoAnterior = this.curso;
            this.curso = curso;
            cursoAnterior.transferirAluno(this, curso);
        }
    }

    public String getNomeCurso() {
        return this.curso.getNome();
    }
}
