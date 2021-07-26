package exercicioRelampagoSupresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetonarNomeEstadoFilial() {
        Cidade cidade = new Cidade(new Estado("MG"));
        Filial filial = new Filial();
        filial.setCidade(cidade);

        assertEquals("MG", filial.getNomeEstadoFilial());
    }

    @Test
    void deveRetonarMensagemFilialSemCidade() {
        Filial filial = new Filial();

        assertEquals("Filial sem cidade", filial.getNomeEstadoFilial());
    }

}