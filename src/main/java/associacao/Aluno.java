package associacao;

public class Aluno extends Pessoa {

    private Curso curso;

    public Aluno(Curso curso) {
        this.setCurso(curso);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso invalido");
        }
        this.curso = curso;
    }

    public String getNomeCurso() {
        return this.curso.getNome();
    }
}
