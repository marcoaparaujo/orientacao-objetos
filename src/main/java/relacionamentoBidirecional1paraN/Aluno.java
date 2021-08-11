package relacionamentoBidirecional1paraN;

public class Aluno {

    private String nome;
    private Curso curso;

    public Aluno(String nome) {
        this.nome = nome;
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
        if (this.curso != curso) {
            if (this.curso != null) {
                this.curso.cancelarAluno(this);
            }
            this.curso = curso;
            if (this.curso != null) {
                this.curso.matricularAluno(this);
            }
        }
    }

    public void cancelarMatricula() {
        this.curso = null;
    }

    public String getNomeCurso() {
        if (this.curso == null) {
            return "Aluno sem curso";
        }
        return this.curso.getNome();
    }
}
