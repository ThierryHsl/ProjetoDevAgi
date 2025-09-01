package HackthonCollections;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<Transacao> extrato;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.extrato = new ArrayList<>();
    }

    public int getNumero() { return numero; }
    public Cliente getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        saldo += valor;

    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;

        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);

        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public List<Transacao> getTransacoes() {
        return extrato;
    }

    public void exibirExtrato() {
        System.out.println("=== Extrato da Conta " + numero + " ===");
        for (Transacao t : extrato) {
            System.out.println(t);
        }
    }
}
