package br.com.orientacaoobjetos.sobrecargametodos.test;

import br.com.orientacaoobjetos.sobrecargametodos.model.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.init("Mateus", 18, "Estagiario", "Masculino");       
        pessoa.imprime();
        
        
        
    }
    
}
