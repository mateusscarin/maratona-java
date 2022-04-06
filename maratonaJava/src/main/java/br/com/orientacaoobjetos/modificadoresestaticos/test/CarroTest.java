package br.com.orientacaoobjetos.modificadoresestaticos.test;

import br.com.orientacaoobjetos.modificadoresestaticos.model.Carro;

public class CarroTest {

    public static void main(String[] args) {
        
        Carro.setVelocidadeLimite(180);
        
        Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Fusca", 340);
        Carro carro3 = new Carro("Mercedes", 275);
        
        carro.imprime();
        carro2.imprime();
        carro3.imprime();
        
    }
    
}
