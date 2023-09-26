package exercicioHeranca03;

public class ProdutoLivro extends Produto {

    public float calcularPreco() {
        return this.getPrecoBase() * 0.95f;
    }
}
