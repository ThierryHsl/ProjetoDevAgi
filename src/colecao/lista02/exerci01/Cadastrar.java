package colecao.lista02.exerci01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Cadastrar {
    public static void main(String[] args) {

        List<Cliente> clienteList = new ArrayList<>();

        clienteList.add(new Cliente("100","thierry", "77777"));
        clienteList.add(new Cliente("1030","thi", "3333"));
        clienteList.add(new Cliente("1050","wag", "1111"));
        clienteList.add(new Cliente("1009","thier", "10101"));


        System.out.println("--- Lista de Clientes ---");
        for (Cliente c : clienteList) {
            System.out.println(c);
        }

        }
    }



