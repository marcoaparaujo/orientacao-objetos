package exercicio3;

public abstract class Aluno extends Pessoa {

    private int matricula;
    private int nota1;
    private int nota2;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getNota1() {
        return this.nota1;
    }

    public void setNota1(int nota1) {
        if (nota1 < 0 || nota1 > 100) {
            throw new IllegalArgumentException("Nota invalida");
        }
        this.nota1 = nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public void setNota2(int nota2) {
        if (nota2 < 0 || nota2 > 100) {
            throw new IllegalArgumentException("Nota invalida");
        }
        this.nota2 = nota2;
    }

    public float calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public abstract boolean verificarAprovacao();
}
