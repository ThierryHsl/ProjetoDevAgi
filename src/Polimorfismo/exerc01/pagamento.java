package Polimorfismo.exerc01;

public class pagamento {
    protected double valor;

    public void processarPagamento() {
        System.out.println(" pagamento processado "+valor);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }
    public pagamento (double valor){
        this.valor = valor;
    }
}