package exercicioHeranca07;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void deveCalcularDataDevolucao() {
        Livro livro = new Livro();
        livro.setDataPublicacao(new Date());
        livro.calcularDataDevolucao();
        assertEquals("18/10/2023", livro.getDataFormatada());
    }

}