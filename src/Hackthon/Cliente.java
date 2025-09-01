package Hackthon;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nome;
    private final String cpf;
    private final String email;
    private final List<Investimento> investimentos;

    public Cliente(String nome, String cpf, String email) {
        if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome inválido.");
        if (cpf == null || cpf.trim().isEmpty()) throw new IllegalArgumentException("CPF inválido.");
        if (email == null || email.trim().isEmpty()) throw new IllegalArgumentException("E-mail inválido.");

        this.nome = nome.trim();
        this.cpf = cpf.trim();
        this.email = email.trim();
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public double getTotalInvestido() {
        return investimentos.stream().mapToDouble(Investimento::getValor).sum();
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public List<Investimento> getInvestimentos() { return investimentos; }

    @Override
    public String toString() {
        return nome + " - CPF: " + cpf + " - Email: " + email + " - Total Investido: R$ " + String.format("%.2f", getTotalInvestido());
    }
}
