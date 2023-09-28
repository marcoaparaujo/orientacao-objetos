package exercicioHeranca05;

import exercicioHeranca05.ProdutoRoupa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPreco() {
        ProdutoRoupa produto = new ProdutoRoupa();
        produto.setPrecoUnitario(10.0f);
        produto.setQuantidadeEstoque(2.0f);
        produto.setQuantidadeComprada(2.0f);
        produto.setDesconto(5.0f);
        assertEquals(15.0f, produto.calcularPreco());
    }

}