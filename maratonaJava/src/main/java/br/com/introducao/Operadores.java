package br.com.introducao;

public class Operadores {
    public static void main(String[] args) {
        
        //Operadores Aritméticos + - * /
        int numero1 = 10;
        int numero2 = 20;
        int resultado;
        
        resultado = numero1 + numero2;
        System.out.println("O resultado da é: "+resultado);
        
        
        //% - retorno de valor numérico
        int resto = 20 % 2;
        System.out.println(resto);
        
        
        //Operadores Lógicos - retorno de valor booleano 
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteVinte "+isDezDiferenteVinte);
        
        // && || !
        
        int idade = 17;
        float salario = 980F;
        
        //&&(AND) = para o retorno ser tru todas as proposições devem ser verdaderas
        boolean isMaiorDeIdadeSalarioBaixo = idade >=18 && salario <=1000;
        System.out.println(isMaiorDeIdadeSalarioBaixo);
        
        //||(OU) = para o retorno ser verdadeiro basta apenas uma das proposições precisa ser verdadeira
        double valContaCorrente = 500;
        double valContaPoupança = 8000;
        double valMoto = 7000;
        
        boolean isMotoCompravel = valContaCorrente >= valMoto || valContaPoupança >= valMoto;
        System.out.println(isMotoCompravel);
        
        
        // = += -= *= /=
        
        double bonus = 3000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 8;
        bonus /= 8;
        System.out.println("O bônus é: "+bonus);
        
        // Contadores
        int contador;
        contador =+ 1;
        contador++;
        contador =- 1;
        ++contador;
        --contador;
        contador--;
        System.out.println(contador);
        
        
    }
    
}
