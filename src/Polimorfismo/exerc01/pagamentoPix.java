package Polimorfismo.exerc01;

public class pagamentoPix extends pagamento {
    private String chavepix;

    public pagamentoPix(double valor, String chavepix) {
        super(valor);
        this.chavepix = chavepix;
    }

    @Override

    public void processarPagamento() {
        System.out.println("O seu pagamento via pix é " + getValor());

    }


}
