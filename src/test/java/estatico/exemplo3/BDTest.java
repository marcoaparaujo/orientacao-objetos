package estatico.exemplo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BDTest {

    @Test
    void deveInserirUmRegistro() {
        BD.zerarBD();
        BD.adicionarRegistro("Marco");
        assertEquals(1, BD.getQuantidadeRegistros());
    }

    @Test
    void deveInserirDoisRegistros() {
        BD.zerarBD();
        BD.adicionarRegistro("Marco");
        BD.adicionarRegistro("Antonio");
        assertEquals(2, BD.getQuantidadeRegistros());
    }

}