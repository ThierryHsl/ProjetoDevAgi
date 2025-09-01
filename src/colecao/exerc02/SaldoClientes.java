package colecao.exerc02;

import java.util.HashMap;
import java.util.Map;

public class SaldoClientes {
    public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        adicionarCliente(map,"1000", 1000);
        adicionarCliente(map,"10070", 1600);
        adicionarCliente(map,"1060", 1070);
        adicionarCliente(map,"1500", 1090);


        exibirSaldos(map);
    }


    public static void adicionarCliente(Map<String, Double> contas , String numeroConta, double saldoInicial) {
        contas.put(numeroConta, saldoInicial);

    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor) {
        double saldoAtual = contas.get(numeroConta);
        double saldoAtt = valor + saldoAtual;
        contas.put(numeroConta, saldoAtt);
        System.out.println(contas);
    }

    public static void exibirSaldos(Map<String, Double> contas) {
        for (Map.Entry<String, Double> entrada : contas.entrySet()) {
            String chave = entrada.getKey();
            Double saldo = entrada.getValue();

            System.out.println(chave + " chave " + saldo +" saldo ");
        }

    }
}