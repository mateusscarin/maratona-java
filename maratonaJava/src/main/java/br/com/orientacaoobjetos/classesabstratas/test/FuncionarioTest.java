package br.com.orientacaoobjetos.classesabstratas.test;

import br.com.orientacaoobjetos.classesabstratas.model.Desenvolvedor;
import br.com.orientacaoobjetos.classesabstratas.model.Gerente;

public class FuncionarioTest {

    public static void main(String[] args) {

       
        Gerente gerente = new Gerente("Cleiton", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mateus", 2000);
        
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        
        desenvolvedor.imprime();
        gerente.imprime();

    }

}
