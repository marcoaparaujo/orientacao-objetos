package exercicioHeranca07;

import java.util.Date;

public class Livro extends MaterialBiblioteca {

    public void calcularDataDevolucao() {
        this.adicionarDias(15);
    }
}
