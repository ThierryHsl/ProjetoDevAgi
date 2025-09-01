package exer01;

public class Main {

    public static void main(String[] args) {
        produto bebidas = new produto();
        bebidas.nome ="coca";
        bebidas.quantidade = 9;
        bebidas.preco = 6.60;

        bebidas.adicionarEstoque(60);
        bebidas.removerEstoque(20);
    }
}
