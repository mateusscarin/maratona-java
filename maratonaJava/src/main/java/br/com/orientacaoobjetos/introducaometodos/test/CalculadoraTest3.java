package br.com.orientacaoobjetos.introducaometodos.test;

import br.com.orientacaoobjetos.introducaometodos.model.Calculadora;

public class CalculadoraTest3 {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
