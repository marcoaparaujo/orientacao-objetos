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

}