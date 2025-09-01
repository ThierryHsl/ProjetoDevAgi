package exer01;

public class produto {
    public String nome;
    public  double preco;
    public int quantidade;


        public void adicionarEstoque(int quantidade){
            System.out.println("quantidade"+quantidade);


        }
        public void removerEstoque(int quantidade){
            System.out.println("removido"+quantidade);



        }

        public void exibir(){
            System.out.println("quantidade de produtos %.2d \n");
            System.out.println(" após remover fica %.2d \n" );
        }

}
