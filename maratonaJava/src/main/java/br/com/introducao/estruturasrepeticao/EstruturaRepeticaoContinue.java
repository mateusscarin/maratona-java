package br.com.introducao.estruturasrepeticao;

public class EstruturaRepeticaoContinue {

    public static void main(String[] args) {
        
        double valTotal = 30000;
        
        for (int parcela = (int) valTotal; parcela >= 1; parcela--) {
            double valorParcela = valTotal / parcela;

            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela" + parcela + " R$" + valorParcela);
        }
    }
    
}
