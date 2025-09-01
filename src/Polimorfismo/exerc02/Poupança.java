package Polimorfismo.exerc02;

public class Poupança extends Investimento {
    @Override
    public double calcularInvestimento(double valorAplicado){
        valorAplicado = valorAplicado*  0.05;

        return 0;
    }
}
