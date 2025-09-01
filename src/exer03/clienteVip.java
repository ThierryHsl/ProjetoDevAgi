package exer03;

public class clienteVip {
    private String nome;
    private String cpf;
    private double limitedaConta;

    public void setNome (String nome){
        this.nome = nome;

    }
    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setLimitedaConta(double limiteConta){
        if (limiteConta >= 1000 && limiteConta<= 100000){
            this.limitedaConta = limiteConta;
        }else {
            System.out.println(" lista invalida");
        }

    }

    public double getLimitedaConta() {
        return limitedaConta;
    }
    public void exibirCliente(){
        System.out.println(" nome "+ getNome());
        System.out.println("cpf" + getCpf());
        System.out.println("limite"+ getLimitedaConta());
    }

    public clienteVip(String nome, String cpf,double limitedaConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.limitedaConta = limitedaConta;
    }
}
