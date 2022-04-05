package br.com.orientacaoobjetos.introducaometodos.test;

import br.com.orientacaoobjetos.introducaometodos.model.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(7, 8);
        System.out.println("Finalizando métodos");
    }
    
}
