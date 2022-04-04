package br.com.introducao;

public class TiposPrimitivosExercicio {
   
    public static void main(String[] args) {
        
        String nome = "Mateus";
        String endereco = "Rua das Margaridas";
        double salario = 300.00;
        String dataRecebimentoSal = "04/04/2022";
        String mensagem = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salario R$"+salario+", na data "+dataRecebimentoSal;
        
        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salario R$"+salario+", na data "+dataRecebimentoSal);
        
        //OU
        
        System.out.println(mensagem);
    }
}
