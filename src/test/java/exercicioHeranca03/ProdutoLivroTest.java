package exercicioHeranca03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPreco() {
        ProdutoLivro produto = new ProdutoLivro();
        produto.setPrecoBase(1000.0f);
        assertEquals(950.0f, produto.calcularPreco());
    }

}