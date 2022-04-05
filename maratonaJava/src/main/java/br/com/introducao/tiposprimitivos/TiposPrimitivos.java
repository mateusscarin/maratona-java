package br.com.introducao.tiposprimitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        
        //int, double, float, char, byte, short, long, boolean
        
        int idade = 18;
        long numeroGrande = 8000000;
        byte idadeByte = 10;
        short idadeShort;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        double salariodouble = 500.09D;
        float salariofloat = 2500.0F;
        
        //casting - forçar variável, em uma variável tentar colocar um valor que não é suportado pelo tipo que ela for
        long exemplocastingL = (long) 158.98D;
        double exemplocastingD = 500.09D;
        float exemplocastingF = (float) 2500.0D;
        
        String nome = "Mateus Henrique Scarin";
        
        
        System.out.println("A minha idade é: " +idade+" anos");
        System.out.println(caractere);
        System.out.println(verdadeiro);
        System.out.println("O nome é: "+nome);
        
    }
}
