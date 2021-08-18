package agregacao.exemplo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    @Test
    void deveCriarMotor() {
        Carro carro = new Carro();

        Motor motor = new Motor();
        carro.setMotor(motor);

        carro.trocarOleo();

        assertTrue(carro.isOleoTrocado());
        assertTrue(carro.getMotor().isOleoTrocadoRecentemente());
        assertTrue(motor.isOleoTrocadoRecentemente());
    }
}