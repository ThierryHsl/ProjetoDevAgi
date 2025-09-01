package Polimorfismo.exerc01;

public class pagamentoCartãocredito extends pagamento {
    private String numeroCartão;

    public pagamentoCartãocredito(String numeroCartão, double valor) {
        super(valor);
        this.numeroCartão = numeroCartão;

    }

    @Override

    public void processarPagamento() {
        System.out.printf("O seu pagamento esta sendo %.2f processado\n", getValor());
    }


}
