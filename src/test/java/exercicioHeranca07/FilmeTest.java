package exercicioHeranca07;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveCalcularDataDevolucao() {
        Filme filme = new Filme();
        filme.setDataPublicacao(new Date());
        filme.calcularDataDevolucao();
        assertEquals("08/10/2023", filme.getDataFormatada());
    }

}