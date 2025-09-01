package exer04;

public class inestimento {
    private String tipoInvestimento;
    private double valorIncial;
    private double taxaAnual;

    public void setTipoInvestimento (String tipoInvestimento){
        this.tipoInvestimento = tipoInvestimento;


    }
   public String getTipoInvestimento (){
        return tipoInvestimento;
   }
   public void setValorIncial(double valorIncial){
        if(valorIncial <= 1000){
            System.out.println("Não é possivel realizar operação");
        }else {
            this.valorIncial = valorIncial;
        }
   }
   public double getValorIncial(){
        return valorIncial;
   }
   public void setTaxaAnual(double taxaAnual){
        if (taxaAnual >= 20 && taxaAnual <= 20){
            this.taxaAnual = taxaAnual;
        }else {
            System.out.println("não é possivel");
        }
   }
   public double getTaxaAnual(){
        return taxaAnual;
   }
   public inestimento(String tipoInvestimento,double valorIncial, double taxaAnual){
        this.tipoInvestimento = tipoInvestimento;
        this.valorIncial= valorIncial;
        this.taxaAnual=taxaAnual;
   }

   public void exibirTudo(){
       System.out.println("tipo"+ tipoInvestimento);
       System.out.println("valor"+ valorIncial);
       System.out.println("valor" +taxaAnual);
   }
   public void calcularValor(int anos ){
        double valorFinal = valorIncial * Math.pow(1+taxaAnual/100,anos);
       System.out.printf("valor final %.2f  ", valorFinal);
   }
}

