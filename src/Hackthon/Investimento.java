package Hackthon;

public class Investimento {
    private final String tipo;   // Ex.: Tesouro Selic, CDB, Ações
    private final double valor;

    public Investimento(String tipo, double valor) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("O tipo de investimento não pode ser vazio.");
        }
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do investimento deve ser positivo.");
        }
        this.tipo = tipo.trim();
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return tipo + " - R$ " + String.format("%.2f", valor);
    }
}
