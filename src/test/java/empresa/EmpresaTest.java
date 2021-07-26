package empresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpresaTest {

    @Test
    void deveAdicionarFuncionario() {
        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario();
        empresa.adicionarFuncionario(funcionario);

        assertEquals(true, empresa.verificarFuncionario(funcionario));
    }

    @Test
    void deveRetornarNumeroFuncionarios() {
        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario();
        empresa.adicionarFuncionario(funcionario);

        Funcionario funcionario2 = new Funcionario();
        empresa.adicionarFuncionario(funcionario2);

        assertEquals(2, empresa.getNumeroFuncionarios());
    }

    @Test
    void deveRemoverFuncionario() {
        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario();
        empresa.adicionarFuncionario(funcionario);
        empresa.removerFuncionario(funcionario);

        assertEquals(false, empresa.verificarFuncionario(funcionario));
    }

    @Test
    void deveRetonarFuncionario() {
        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jose");
        empresa.adicionarFuncionario(funcionario);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Joao");
        empresa.adicionarFuncionario(funcionario2);

        assertEquals("Jose", empresa.getFuncionario(0).getNome());
        assertEquals("Joao", empresa.getFuncionario(1).getNome());
    }

    @Test
    void deveVerificarListaFuncionariosVazia() {
        Empresa empresa = new Empresa();

        assertEquals(true, empresa.verificarListaFuncionariosVazia());
    }

    @Test
    void deveVerificarListaFuncionariosNaoVazia() {
        Empresa empresa = new Empresa();
        Funcionario funcionario = new Funcionario();
        empresa.adicionarFuncionario(funcionario);

        assertEquals(false, empresa.verificarListaFuncionariosVazia());
    }

}