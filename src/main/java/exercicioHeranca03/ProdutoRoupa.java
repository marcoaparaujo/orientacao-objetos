package exercicioHeranca03;

public class ProdutoRoupa extends Produto {

    public float calcularPreco() {
        return this.getPrecoBase() * 0.8f;
    }
}
