package colecao.exerc01;

import java.util.HashSet;
import java.util.Set;

public class ContasUnicas {


        private Set<Integer> contas; // atributo principal

        // Construtor inicializando a coleção
    public ContasUnicas() {
            this.contas = new HashSet<>();
        }

        // Adiciona conta
        public void adicionarConta ( int numeroConta){
            if (contas.add(numeroConta)) {
                System.out.println("Conta adicionada: " + numeroConta);
            } else {
                System.out.println("Conta já existe: " + numeroConta);
            }
        }

        // Verifica se existe
        public boolean existeConta ( int numeroConta){
            return contas.contains(numeroConta);
        }

        // Exibe todas as contas
        public void exibir () {
            System.out.println("Contas cadastradas:");
            for (Integer conta : contas) {
                System.out.println(conta);
            }
        }

}
