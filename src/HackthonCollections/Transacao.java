package HackthonCollections;

import java.util.*;

public class Transacao {
    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;
    private static int idCliente = 1;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU BANCO DIGITAL ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Conta");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("5 - Transferência");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Extrato");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");

                int opcao = Integer.parseInt(sc.nextLine());

            try {
                switch (opcao) {
                    case 1 -> cadastrarCliente(sc);
                    case 2 -> cadastrarConta(sc);
                    case 3 -> deposito(sc);
                    case 4 -> saque(sc);
                    case 5 -> transferencia(sc);
                    case 6 -> consultarSaldo(sc);
                    case 7 -> extrato(sc);
                    case 8 -> listarClientes();
                    case 9 -> rodando = false;
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        sc.close();
    }

    private static void cadastrarCliente(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Cliente novo = new Cliente(idCliente++, nome, cpf);
        if (clientes.add(novo)) {
            System.out.println("Cliente cadastrado com sucesso.");
        } else {
            System.out.println("Cliente já existe.");
        }
    }

    private static void cadastrarConta(Scanner sc) {
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();

        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                Conta conta = new Conta(numeroConta++, c);
                contas.put(conta.getNumero(), conta);
                System.out.println("Conta criada com número: " + conta.getNumero());
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    private static void deposito(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("Valor do depósito: ");
        double valor = Double.parseDouble(sc.nextLine());

        Conta conta = contas.get(numero);
        if (conta != null) {
            conta.depositar(valor);
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Conta não encontrada.");
        }

    }

    private static void saque(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("Valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());

        Conta conta = contas.get(numero);
        if (conta != null) {
            conta.sacar(valor);
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void transferencia(Scanner sc) {
        System.out.print("Conta de origem: ");
        int origem = Integer.parseInt(sc.nextLine());
        System.out.print("Conta de destino: ");
        int destino = Integer.parseInt(sc.nextLine());
        System.out.print("Valor da transferência: ");
        double valor = Double.parseDouble(sc.nextLine());

        Conta contaOrigem = contas.get(origem);
        Conta contaDestino = contas.get(destino);

        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Transferência realizada.");
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }

    private static void consultarSaldo(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());

        Conta conta = contas.get(numero);
        if (conta != null) {
            System.out.println("Saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void extrato(Scanner sc) {
        System.out.print("Número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());

        Conta conta = contas.get(numero);
        if (conta != null) {
            conta.exibirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Clientes ===");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}
