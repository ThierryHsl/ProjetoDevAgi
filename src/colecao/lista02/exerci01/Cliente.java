package colecao.lista02.exerci01;

public class Cliente {
    private String id;
    private String nome;
    private String cpf;

    public Cliente(String id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override       
    public String toString() {
        return "Cliente " + "id='" + id + '\'' + ", nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + '}';
    }
}