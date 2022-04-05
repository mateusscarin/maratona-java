package br.com.orientacaoobjetos.introducaometodos.test;

import br.com.orientacaoobjetos.introducaometodos.model.Calculadora;

public class CalculadoraTest2 {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(7, 8);
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        
    }
    
}
