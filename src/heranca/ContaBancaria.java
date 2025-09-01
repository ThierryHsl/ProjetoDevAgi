package heranca;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;
    protected double limiteCheque;


    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
    public void setNumeroConta(String numeroConta){

        this.numeroConta = numeroConta;
    }
    public double getSaldo(double saldo){

        return saldo;
    }
    public String getNumeroConta(String numeroConta){
        return numeroConta;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTitular(){
        return titular;
    }
    public void ContaBancaria(String titular,String numeroConta,double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

}

