package hack2;

class RendaFixa extends Investimento {

    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * 1.05; // 5% de rendimento
    }
}
