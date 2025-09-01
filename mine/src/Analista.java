public class Analista extends Funcionarios implements BonusFixo{
    //private double bonus
    public Analista(String nome, double salario) {
        super(nome, salario);
    }
    public void exibir(){
        System.out.printf("Nome:%s\n" ,getNome());
        System.out.printf("Salario R$ %.2f\n", getSalario());

    }

    @Override
    public void bonus() {
        System.out.printf("Você possui um bonus de R$ 1000");
    }
}
