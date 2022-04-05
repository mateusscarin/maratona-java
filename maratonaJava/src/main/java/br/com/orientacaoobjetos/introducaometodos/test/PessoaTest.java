package br.com.orientacaoobjetos.introducaometodos.test;

import br.com.orientacaoobjetos.introducaometodos.model.Pessoa;

public class PessoaTest {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mateus");
        pessoa.setIdade(17);
        
//        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        
        
    }
    
}
