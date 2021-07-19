package exercicioRelampagoSupresaPI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetonarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setDescricao("Doutorado");

        Professor professor = new Professor(escolaridade);

        Curso curso = new Curso(professor);

        assertEquals("Doutorado", curso.getDescricaoEscolaridadeCoordenador());
    }

    @Test
    public void deveRetornarEstadoCurso() {
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        Curso curso = new Curso();
        Escola escola = new Escola();
        escola.setCidadeEscola(cidade);
        curso.setEscolaCurso(escola);
        assertEquals("MG", curso.retornaEstadoCurso());
    }

    @Test
    public void deveRetornarExcecaoCursoSemEscola() {
        try {
            Curso curso = new Curso();
            curso.retornaEstadoCurso();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola não informada!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Superior");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);

        assertEquals("Ensino Superior", curso.getNomeTipoEnsino());
    }

    @Test
    public void deveRetornarExcecaoCursoSemTipoEnsino() {
        try {
            Curso curso = new Curso();
            curso.getNomeTipoEnsino();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Sem tipo de ensino", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoCursoSemCoordenador() {
        try {
            Curso curso = new Curso();
            curso.getNomeCoordenadorCurso();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem coordenador", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoCursoSemEscolaDiretor() {
        try {
            Curso curso = new Curso();
            curso.getNomeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Curso sem escola", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeDiretor(){
        Professor diretor = new Professor(new Escolaridade("Superior"));
        diretor.setNome("José");
        Curso curso = new Curso();
        Escola escola = new Escola(diretor);
        curso.setEscolaCurso(escola);
        assertEquals("José", curso.getNomeDiretor());
    }

}