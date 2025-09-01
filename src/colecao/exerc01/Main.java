package colecao.exerc01;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ContasUnicas cu = new ContasUnicas();

        cu.adicionarConta(1919);
        cu.adicionarConta(2020);
        cu.adicionarConta(1919); // repetida, vai dar "Conta já existe"

        cu.exibir();

        System.out.println("Conta 2020 existe? " + cu.existeConta(2020));
        System.out.println("Conta 3030 existe? " + cu.existeConta(3030));
    }
}