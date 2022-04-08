package br.com.orientacaoobjetos.polimorfismo.test;

import br.com.orientacaoobjetos.polimorfismo.model.Computador;
import br.com.orientacaoobjetos.polimorfismo.model.Produto;
import br.com.orientacaoobjetos.polimorfismo.model.Tomate;

public class ProdutoTest2 {

    public static void main(String[] args) {

        Produto produto = new Computador("Intel 5", 4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------------------");

        Produto produto2 = new Tomate("Tomatin", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("-------------------------");

    }
}
