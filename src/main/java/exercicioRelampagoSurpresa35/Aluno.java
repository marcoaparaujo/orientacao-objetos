package exercicioRelampagoSurpresa35;

public abstract class Aluno extends Pessoa {

    private int matricula;

    private float nota1;
    private float nota2;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public abstract String verificarAprovacao();

    public String getInfo() {
        return this.nome + " - " + this.matricula + " - " + this.verificarAprovacao();
    }

}
