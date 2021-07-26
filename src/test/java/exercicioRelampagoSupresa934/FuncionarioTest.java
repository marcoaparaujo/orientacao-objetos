package exercicioRelampagoSupresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarEscolaridadeFuncionario() {
        Escolaridade escolaridade = new Escolaridade("Superior");
        Funcionario funcionario = new Funcionario("Maria", new Departamento());
        funcionario.setEscolaridade(escolaridade);

        assertEquals("Superior", funcionario.getNomeEscolaridadeFuncionario());
    }

    @Test
    void deveRetonarMensagemFuncionarioSemEscolaridade() {
        Funcionario funcionario = new Funcionario("Maria", new Departamento());
        assertEquals("Funcionario sem escolaridade", funcionario.getNomeEscolaridadeFuncionario());
    }

    @Test
    void deveRetornarExcecaoInstanciarFuncionarioSemDepartamento() {
        try {
            Funcionario funcionario = new Funcionario("Maria", null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Departamento obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoMudarDepartamentoParaNulo() {
        try {
            Funcionario funcionario = new Funcionario("Maria", new Departamento());
            funcionario.setAlocacao(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Departamento obrigatorio", e.getMessage());
        }
    }

    @Test
    void deveRetonarNomePaisAlocacaoFuncionario() {
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario("Maria", departamento);
        Empresa empresa = new Empresa();
        Grupo grupo = new Grupo();
        Pais pais = new Pais("Brasil");
        departamento.setEmpresa(empresa);
        empresa.setGrupo(grupo);
        grupo.setSede(pais);

        assertEquals("Brasil", funcionario.getNomePaisAlocacaoFuncionario());
    }


    @Test
    void deveRetornarNomeEstadoFilialCoordenacao() {
        Funcionario funcionario = new Funcionario("Maria", new Departamento());
        Filial filial = new Filial();
        Cidade cidade = new Cidade(new Estado("MG"));
        filial.setCidade(cidade);
        funcionario.setCoordenacao(filial);

        assertEquals("MG", funcionario.getNomeEstadoFilialCoordenacao());
    }

    @Test
    void deveRetonarMensagemFuncionarioSemCoordenacao() {
        Funcionario funcionario = new Funcionario("Maria", new Departamento());

        assertEquals("Funcionario nao coordena filial", funcionario.getNomeEstadoFilialCoordenacao());
    }

}