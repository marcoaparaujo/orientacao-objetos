import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TesteDataTest {

    @Test
    void deveTestarData() {
        TesteData data = new TesteData(new Date());
        data.adicionarDias(5);
        assertEquals("02/10/2023", data.getDataFormatada());
    }

}