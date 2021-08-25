package estatico.exemplo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoTest {

    @Test
    void deveConverterValorDolar() {
        CotacaoDolar.setCotacaoDolar(5.21f);

        Investimento investimento = new Investimento();

        investimento.setValor(1000);

        assertEquals(5210.0f, investimento.converterParaDolar());
    }

}