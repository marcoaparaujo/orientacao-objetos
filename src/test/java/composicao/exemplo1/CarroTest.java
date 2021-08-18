package composicao.exemplo1;

import composicao.exemplo1.Carro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCriarMotor() {
        Carro carro = new Carro();

        // Motor motor = new Motor();

        carro.trocarOleo();

        assertTrue(carro.isOleoTrocado());
    }

}