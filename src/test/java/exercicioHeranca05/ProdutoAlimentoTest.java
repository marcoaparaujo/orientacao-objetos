package exercicioHeranca05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    @Test
    void naoDeveComprarAlemEstoque() {
        try {
            ProdutoAlimento produto = new ProdutoAlimento();
            produto.setQuantidadeEstoque(100.0f);
            produto.setQuantidadeComprada(100.1f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }

    @Test
    void deveComprarQuantidadeAbaixoEstoque() {
        ProdutoAlimento produto = new ProdutoAlimento();
        produto.setQuantidadeEstoque(100.0f);
        produto.setQuantidadeComprada(100.0f);
        assertEquals(0.0f, produto.getQuantidadeEstoque());
    }

    @Test
    void deveCalcularPreco() {
        ProdutoAlimento produto = new ProdutoAlimento();
        produto.setPrecoUnitario(10.0f);
        produto.setQuantidadeEstoque(2.0f);
        produto.setQuantidadeComprada(2.0f);
        assertEquals(20.0f, produto.calcularPreco());
    }

}