public class Gerente extends Funcionarios implements BonusFixo {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void exibir(){
        System.out.printf("Nome:%s\n",getNome());
        System.out.printf("Salario R$ %.2f\n", getSalario());

    }
    @Override
    public void bonus() {
        System.out.printf("Você possui um bonus de R$ 2000");
        System.out.println("  ------------------- \n\n");
    }

}
