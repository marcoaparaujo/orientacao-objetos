package exercicioRelampagoSupresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetonarNomePais() {
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais pais = new Pais("Brasil");
        empresa.setGrupo(grupo);
        grupo.setSede(pais);

        assertEquals("Brasil", empresa.getNomePaisEmpresa());
    }

    @Test
    void deveRetonarMensagemEmpresaSemGrupo() {
        Empresa empresa = new Empresa();

        assertEquals("Empresa sem grupo", empresa.getNomePaisEmpresa());
    }

}