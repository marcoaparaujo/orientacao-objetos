package inicio;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int matricula;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String matricular() {
        return "inicio.Aluno matriculado: " + this.nome + " " + this.sobrenome;
    }

}
