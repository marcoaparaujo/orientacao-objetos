package composicao.exemplo1;

public class Carro {

    Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void trocarOleo() {
        this.motor.setOleoTrocadoRecentemente(true);
    }

    public boolean isOleoTrocado() {
        return this.motor.isOleoTrocadoRecentemente();
    }

    public class Motor {    // inner class

        private boolean oleoTrocadoRecentemente;

        public boolean isOleoTrocadoRecentemente() {
            return oleoTrocadoRecentemente;
        }

        public void setOleoTrocadoRecentemente(boolean oleoTrocadoRecentemente) {
            this.oleoTrocadoRecentemente = oleoTrocadoRecentemente;
        }
    }
}
