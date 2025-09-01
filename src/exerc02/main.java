package exerc02;

public class main {
    public static void main(String[] args) {

        contaBancaria conta = new contaBancaria();

        conta.setTitular("matheus");
        conta.setNumerodaConta(" 7770");
        conta.depositar(10000);
        conta.sacar(100);
        conta.exibiExtrato();


    }
}
