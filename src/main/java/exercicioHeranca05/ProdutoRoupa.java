package exercicioHeranca05;

public class ProdutoRoupa extends Produto {

    private float desconto;

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        if (desconto < 0) {
            throw new IllegalArgumentException("Desconto invalido");
        }
        this.desconto = desconto;
    }


}
