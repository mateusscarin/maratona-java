package br.com.estruturasrepeticao;

public class EstruturaRepeticaoExercicio3 {

    public static void main(String[] args) {
        
        double valTotal = 30000;
        
        for(int parcela = 1; parcela <= valTotal; parcela++){
        double valorParcela = valTotal / parcela;
        
        if(valorParcela < 1000){
            break;
        }
            System.out.println("Parcela" + parcela+" R$"+valorParcela);
            System.out.println("");
        }
    }
}
