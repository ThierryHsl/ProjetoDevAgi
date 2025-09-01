package Hackthon;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SistemaInvestimento {
    private final List<Cliente> clientes;

    public SistemaInvestimento() {
        this.clientes = new ArrayList<>();
    }

    // Retorna mensagem se cliente cadastrado ou CPF já existe
    public String cadastrarCliente(Cliente cliente) {
        Optional<Cliente> existe = clientes.stream()
                .filter(c -> c.getCpf().equals(cliente.getCpf()))
                .findFirst();
        if (existe.isPresent()) {
            return "Cliente com CPF " + cliente.getCpf() + " já cadastrado!";
        }
        clientes.add(cliente);
        return "Cliente cadastrado com sucesso!";
    }

    public String adicionarInvestimento(String cpf, String tipo, double valor) {
        Cliente cliente = clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado."));
        Investimento investimento = new Investimento(tipo, valor);
        cliente.adicionarInvestimento(investimento);
        return "Investimento adicionado com sucesso!";
    }

    public String listarInvestimentos(String cpf) {
        Cliente cliente = clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado."));
        if (cliente.getInvestimentos().isEmpty()) {
            return "Nenhum investimento registrado para " + cliente.getNome();
        }
        StringBuilder sb = new StringBuilder("Investimentos de " + cliente.getNome() + ":\n");
        cliente.getInvestimentos().forEach(inv -> sb.append(inv).append("\n"));
        return sb.toString();
    }

    public String relatorio() {
        if (clientes.isEmpty()) return "Nenhum cliente cadastrado.";
        StringBuilder sb = new StringBuilder("---- Relatório Geral ----\n");
        clientes.forEach(c -> sb.append(c).append("\n"));
        return sb.toString();
    }
    public boolean verificarCpfExistente(String cpf) {
        return clientes.stream().anyMatch(c -> c.getCpf().equals(cpf));
    }

}
