package Polimorfismo.exerc01;

public class main {
    public static void main(String[] args) {

        pagamento[] pagamentos = new pagamento[3];

        pagamentos[0] = new pagamento(100.0);
        pagamentos[1] = new pagamentoCartãocredito("77777777777", 259);
        pagamentos[2] = new pagamentoPix(80.0, "meuemail@exemplo.com");

        // Percorrendo o vetor chamando o m
        for (pagamento p : pagamentos) {
            p.processarPagamento();


        }
    }
}