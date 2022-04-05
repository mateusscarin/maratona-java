package br.com.introducao.estruturascondicionais;

public class EstruturasCondicionaisExercicio {
    
    public static void main(String[] args) {
        
    
        double salarioAnual = 25000;
        double primeiraFaixa = 0.97;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.495;
        double valorimposto;
        
        if(salarioAnual <= 34712){
            valorimposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual >= 34712 && salarioAnual <= 68507){
            valorimposto = salarioAnual * segundaFaixa;
        }else{
            valorimposto = salarioAnual * terceiraFaixa;
        }
        
        System.out.println(valorimposto);
            
    } 
}
