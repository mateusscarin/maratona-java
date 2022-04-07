package br.com.orientacaoobjetos.modificadorfinal.test;

import br.com.orientacaoobjetos.modificadorfinal.model.Carro;
import br.com.orientacaoobjetos.modificadorfinal.model.Ferrari;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Mateus");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Jorge");
        ferrari.imprime();
    }
}
