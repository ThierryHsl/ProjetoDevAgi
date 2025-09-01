package HackthonCollections;

import java.util.Objects;
import java.util.Set;
import java.util.Scanner;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;

    public Cliente(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public void dadosCliente(Set<Cliente> clientes) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        setNome(sc.nextLine());
        System.out.print("Digite seu CPF: ");
        setCpf(sc.nextLine());

        if (clientes.contains(this)) {
            System.out.println("⚠ Não é possível realizar a operação: CPF já cadastrado!");
        } else {
            clientes.add(this);
            System.out.println("✅ Cliente cadastrado com sucesso!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "', cpf='" + cpf + "'}";
    }
}
