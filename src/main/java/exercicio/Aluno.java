package exercicio;

public abstract class Aluno {

    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno(int matricula, String nome, Curso curso) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        if (curso == null) {
            throw new NullPointerException("Curso nulo");
        }
        this.curso = curso;
    }

    public abstract String emitirDiploma();

    public String getNomeCurso() {
        return this.curso.getNome();
    }

}
