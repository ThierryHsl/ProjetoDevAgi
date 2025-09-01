package hack2;

class RendaVariavel extends Investimento {

    public RendaVariavel(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * 1.10; // 10% de rendimento
    }
}
