package agregacao.exemplo1;

public class Carro {

    Motor motor;

    public Carro() {
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void trocarOleo() {
        if (this.motor != null) {
            this.motor.setOleoTrocadoRecentemente(true);
        }
    }

    public boolean isOleoTrocado() {
        if (this.motor != null) {
            return this.motor.isOleoTrocadoRecentemente();
        }
        return false;
    }
}
