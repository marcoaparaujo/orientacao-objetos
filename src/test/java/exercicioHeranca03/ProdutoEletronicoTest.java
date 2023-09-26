package exercicioHeranca03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPreco() {
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setPrecoBase(1000.0f);
        assertEquals(900.0f, produto.calcularPreco());
    }

}