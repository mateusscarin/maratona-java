package br.com.orientacaoobjetos.introducaoclasses.test;

import br.com.orientacaoobjetos.introducaoclasses.model.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.modelo = "Caminhonete";
        carro1.nome = "Hilux";
        carro1.ano = 2012;

        Carro carro2 = new Carro();
        carro2.modelo = "Esportivo";
        carro2.nome = "Uno";
        carro2.ano = 2025;

        System.out.println("Carro 1: " + carro1.nome + " modelo: " + carro1.modelo + " ano: " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " modelo: " + carro2.modelo + " ano: " + carro2.ano);

    }
}
