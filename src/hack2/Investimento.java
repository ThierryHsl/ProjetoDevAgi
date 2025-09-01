package hack2;

public abstract class Investimento {
        protected double valorInicial;

        public Investimento(double valorInicial) {
            this.valorInicial = valorInicial;
        }

        public double getValorInicial() {
            return valorInicial;
        }

        public void setValorInicial() {
            this.valorInicial = valorInicial;
        }
        public abstract double calcularRendimento();
    }


