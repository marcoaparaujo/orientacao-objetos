package exercicioRelampagoSupresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarNomeEscolaridadePresidente() {
        Grupo grupo = new Grupo();
        Funcionario presidente = new Funcionario("Maria", new Departamento());
        Escolaridade escolaridade = new Escolaridade("Superior");
        grupo.setPresidente(presidente);
        presidente.setEscolaridade(escolaridade);

        assertEquals("Superior", grupo.getNomeEscolaridadePresidente());
    }

    @Test
    void deveRetornarMensagemGrupoSemPresidente() {
        Grupo grupo = new Grupo();

        assertEquals("Grupo sem presidente", grupo.getNomeEscolaridadePresidente());
    }

    @Test
    void deveRetornarNomePais() {
        Grupo grupo = new Grupo();
        Pais pais = new Pais("Brasil");
        grupo.setSede(pais);

        assertEquals("Brasil", grupo.getNomePais());
    }

    @Test
    void deveRetornarMensagemGrupoSemPais() {
        Grupo grupo = new Grupo();

        assertEquals("Grupo sem país", grupo.getNomePais());
    }

}