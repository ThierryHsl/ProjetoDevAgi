package exerc02;

public class contaBancaria {
    private String titular;
    private String numerodaConta;
    private double saldo;

    public String getNumerodaConta() {
        return numerodaConta;
    }

    public void setNumerodaConta(String numerodaConta) {
        this.numerodaConta = numerodaConta;
    }

    public String getTitular() {

        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void  depositar(double valor){
        if(valor > 0) {
            this.saldo += valor;
        }else {
            System.out.println(" não é possivel");
        }
    }
   public void sacar (double valor){
        if (valor <= saldo){
            this.saldo -= valor;
        }
        else {
            System.out.println("Não é possivel");
        }
   }
   public void exibiExtrato(){
       System.out.println(" numero conta "+ getNumerodaConta());
       System.out.println(" saldo"+ this.saldo);
       System.out.println("titular"+getTitular());
   }
}
