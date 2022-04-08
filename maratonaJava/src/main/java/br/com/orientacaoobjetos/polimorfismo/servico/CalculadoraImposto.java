package br.com.orientacaoobjetos.polimorfismo.servico;

import br.com.orientacaoobjetos.polimorfismo.model.Produto;

public class CalculadoraImposto {

    public static void calculaImposto(Produto produto) {

        System.out.println("-------------------");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        System.out.println("");

    }
}
