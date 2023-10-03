package exercicioHeranca07;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {

    @Test
    void deveCalcularDataDevolucao() {
        Revista revista = new Revista();
        revista.setDataPublicacao(new Date());
        revista.calcularDataDevolucao();
        assertEquals("10/10/2023", revista.getDataFormatada());
    }

}