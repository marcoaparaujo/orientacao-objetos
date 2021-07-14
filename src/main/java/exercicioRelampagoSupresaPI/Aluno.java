package exercicioRelampagoSupresaPI;

import com.sun.corba.se.spi.oa.NullServant;

public class Aluno extends Pessoa{

    private Curso cursoAluno;

    public Aluno (Escolaridade escolaridade){
        super (escolaridade);
    }

    public Curso getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(Curso cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    public String retornaEstadoEscolaAluno() {
        if (this.cursoAluno == null) {
            throw new NullPointerException("Curso não informado!");
        }
        return this.cursoAluno.retornaEstadoCurso();
    }
}

