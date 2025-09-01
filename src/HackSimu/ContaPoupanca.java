package HackSimu;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(double saldo, String titular, String cliente, String numeroConta) {
        super(saldo, titular, cliente, numeroConta);
    }

    @Override
    public void aplicarJuros() {
        setSaldo(getSaldo() * 1.01);

    }
    public void exibir(){
        System.out.println(getSaldo());
        System.out.println(getCliente());
        System.out.println(getNumeroConta());
        System.out.println(getTitular());
    }
}
