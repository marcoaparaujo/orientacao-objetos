package exercicioHeranca05;

public abstract class Produto {

    private String nome;
    private float precoUnitario;
    private float quantidadeEstoque;
    private float quantidadeComprada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public float getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(float quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(float quantidadeComprada) {
        if (quantidadeComprada > this.quantidadeEstoque) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.quantidadeComprada = quantidadeComprada;
        this.quantidadeEstoque = this.quantidadeEstoque - quantidadeComprada;
    }

    public float getDesconto() {
        return 0.0f;
    }

    public float calcularPreco() {
        return this.getPrecoUnitario() * this.getQuantidadeComprada() - this.getDesconto();
    }
}
