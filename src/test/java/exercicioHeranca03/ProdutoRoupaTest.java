package exercicioHeranca03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPreco() {
        ProdutoRoupa produto = new ProdutoRoupa();
        produto.setPrecoBase(1000.0f);
        assertEquals(800.0f, produto.calcularPreco());
    }

}