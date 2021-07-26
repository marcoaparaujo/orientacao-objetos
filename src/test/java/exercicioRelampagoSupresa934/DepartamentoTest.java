package exercicioRelampagoSupresa934;

import com.sun.xml.internal.rngom.digested.DPattern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarNomePais() {
        Departamento departamento = new Departamento();
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais pais = new Pais("Brasil");
        departamento.setEmpresa(empresa);
        empresa.setGrupo(grupo);
        grupo.setSede(pais);

        assertEquals("Brasil", departamento.getNomePaisDepartamento());
    }

    @Test
    void deveRetornarMensagemDepartamentoSemEmpresa() {
        Departamento departamento = new Departamento();

        assertEquals("Departamento sem empresa", departamento.getNomePaisDepartamento());
    }

    @Test
    void deveRetonarNomeEscolaridadeChefe() {
        Departamento departamento = new Departamento();
        Escolaridade escolaridade = new Escolaridade("Mestre");
        Funcionario funcionario = new Funcionario(departamento);
        funcionario.setEscolaridade(escolaridade);
        departamento.setChefe(funcionario);

        assertEquals("Mestre", departamento.getNomeEscolaridadeChefe());
    }

    @Test
    void deveRetornarMensagemDepartamentoSemChefe() {
        Departamento departamento = new Departamento();

        assertEquals("Departamento sem chefe", departamento.getNomeEscolaridadeChefe());
    }

}