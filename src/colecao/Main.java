package colecao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("teste");
        lista.add("thierry");
        lista.add("wag");

        System.out.println("segue" + lista) ;

        for(int i = 0; i < lista.size() +3; i++)
            System.out.println(lista);
        }
    }


