package Hackthon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            SistemaInvestimento si = new SistemaInvestimento();

            while (true) {
                mostrarMenu();
                String opcao = sc.nextLine().trim();

                try {
                    String resultado = "";

                    switch (opcao) {
                        case "1" -> {
                            String cpf = lerEntrada(sc, "CPF: ");
                            // Verifica se o CPF já existe
                            if (si.verificarCpfExistente(cpf)) {
                                System.out.println(" Cliente com CPF " + cpf + " já cadastrado!");
                            } else {
                                String nome = lerEntrada(sc, "Nome: ");
                                String email = lerEntrada(sc, "E-mail: ");
                                Cliente cliente = new Cliente(nome, cpf, email);
                                System.out.println(si.cadastrarCliente(cliente));
                            }
                        }
                        case "2" -> {
                            String cpf = lerEntrada(sc, "CPF do cliente: ");
                            String tipo = lerEntrada(sc, "Tipo do investimento(ex.: Tesouro Selic, CDB, Ações): ");
                            double valor = lerValorPositivo(sc, "Valor aplicado: ");

                            si.adicionarInvestimento(cpf, tipo, valor);
                            System.out.println("Investimento adicionado com sucesso!");
                        }
                        case "3" -> {
                            String cpf = lerEntrada(sc, "CPF do cliente: ");
                            si.listarInvestimentos(cpf);
                        }
                        case "4" -> si.relatorio();
                        case "0" -> {
                            System.out.println("Saindo...");
                            return;
                        }
                        default -> System.out.println("Opção inválida. Tente novamente.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Tente novamente.");
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro: " + e.getMessage());
                }
                System.out.println("\nPressione Enter para continuar...");
                sc.nextLine();
                limparTela();
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Adicionar investimento");
        System.out.println("3 - Listar investimentos de um cliente");
        System.out.println("4 - Relatório geral");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private static String lerEntrada(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine().trim();
    }

    private static double lerValorPositivo(Scanner sc, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine().trim().replace(",", ".");
            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) return valor;
                System.out.println("O valor deve ser positivo.");
            } catch (NumberFormatException e) {
                System.out.println("Informe um número válido.");
            }
        }
    }

        private static void limparTela() {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

