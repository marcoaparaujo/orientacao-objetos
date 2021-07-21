package exercicioRelampagoSupresa934;

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


}