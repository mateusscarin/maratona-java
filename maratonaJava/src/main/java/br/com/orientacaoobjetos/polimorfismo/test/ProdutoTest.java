package br.com.orientacaoobjetos.polimorfismo.test;

import br.com.orientacaoobjetos.polimorfismo.model.Computador;
import br.com.orientacaoobjetos.polimorfismo.model.Televisao;
import br.com.orientacaoobjetos.polimorfismo.model.Tomate;
import br.com.orientacaoobjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {

    public static void main(String[] args) {

        Computador computador = new Computador("Positivo", 5000);
        Tomate tomate = new Tomate("Vermelhor", 10);
        Televisao tv = new Televisao("Samsung 72\"", 4000);

        CalculadoraImposto.calculaImposto(computador);
        CalculadoraImposto.calculaImposto(tomate);
        CalculadoraImposto.calculaImposto(tv);
    }
}
