public class Main {
    public static void main(String[] args) {

        //A IDEIA É USAR Funcionario ger = new Gerente(); -> mas só obs msm, ta tranquilo
        Analista ana = new Analista("Thierry", 2000);
        Gerente ger = new Gerente(" Matheus", 3000);

        ger.exibir();
        ger.bonus();

        ana.exibir();
        ana.bonus();

    }

}
