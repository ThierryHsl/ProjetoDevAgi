package hack2;

public class Main {
    public static void main(String[] args) {
        Investimento[] inv = new Investimento[4];

        inv[0] = new RendaFixa(2000);
        inv[1] = new RendaFixa(1000);
        inv[2] = new RendaVariavel(2000);
        inv[3] = new RendaVariavel(1000);

        for(int i = 0; i < inv.length; i++) {
            if (inv[i] instanceof RendaFixa) {
                System.out.println("Renda fixa " + inv[i].calcularRendimento());
            } else if (inv[i] instanceof RendaVariavel) {
                System.out.println("Renda variavel: " + inv[i].calcularRendimento());
            }

        }

    }
}
