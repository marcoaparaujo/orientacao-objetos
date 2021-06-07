package aprovacao;

public class Aluno {
    private int frequencia;
    private float notaAvaliacao1;
    private float notaAvaliacao2;
    private float notaAvaliacaoFinal;

    public Aluno() { }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public float getNotaAvaliacao1() {
        return notaAvaliacao1;
    }

    public void setNotaAvaliacao1(float notaAvaliacao1) {
        this.notaAvaliacao1 = notaAvaliacao1;
    }

    public float getNotaAvaliacao2() {
        return notaAvaliacao2;
    }

    public void setNotaAvaliacao2(float notaAvaliacao2) {
        this.notaAvaliacao2 = notaAvaliacao2;
    }

    public float getNotaAvaliacaoFinal() {
        return notaAvaliacaoFinal;
    }

    public void setNotaAvaliacaoFinal(float notaAvaliacaoFinal) {
        this.notaAvaliacaoFinal = notaAvaliacaoFinal;
    }

    public boolean verificarAprovacao()
    {
        if (this.frequencia < 75) {
            return false;
        }
        else {
            float media = (this.notaAvaliacao1 + this.notaAvaliacao2) / 2;
            if (media < 3.0f) {
                return false;
            }
            else {
                if (media >= 7.0f) {
                    return true;
                }
                else {
                    if ((media + this.notaAvaliacaoFinal) / 2 >= 5.0f) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
    }
}
