package HackSimu;

public class Main {
    public static void main(String[] args) {


        Cliente thi = new Cliente("Thierry", "818188383");
        ContaCorrente cc = new ContaCorrente(1000,"thi2","wag", "9929292");
        ContaPoupanca cp = new ContaPoupanca(1000,"92929292","wag2","82299292");

        cc.depositar(1500);
        cc.sacar(1000);
        cc.aplicarJuros();

        cp.depositar(1500);
        cp.sacar(1000);
        cp.aplicarJuros();

        cc.exibir();
        cp.exibir();

        cc.getSaldo();
        cp.getSaldo();
    }
}

