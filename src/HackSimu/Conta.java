package HackSimu;

public abstract class Conta implements OperacoesBancarias {
    private String numeroConta;
    private String cliente;
    private String titular;
    protected double saldo;

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            this.saldo += valor;
            System.out.printf("Não é possivel realizar operação!!\n");
        } else {
            System.out.printf("deposito realizado %.2f\n", valor);
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            this.saldo -= valor;
            System.out.printf("Saque realizado! %.2f", valor);
        } else {
            System.out.printf("Não é possivel realizar a operação");
        }
    }

    public Conta(double saldo, String titular, String cliente, String numeroConta) {
        this.saldo = saldo;
        this.titular = titular;
        this.cliente = cliente;
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void aplicarJuros();

    public void exibir() {
        System.out.println(getSaldo());
        System.out.println(getCliente());
        System.out.println(getNumeroConta());
        System.out.println(getTitular());
    }
}