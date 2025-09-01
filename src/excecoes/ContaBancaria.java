package excecoes;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        double[] saldo = {100, 200, 300, 400, 500, 300, 400};
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf("O valor é ", saldo[i]);
                i = sc.nextInt();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("conta não encontrada");
        }
    }
}
