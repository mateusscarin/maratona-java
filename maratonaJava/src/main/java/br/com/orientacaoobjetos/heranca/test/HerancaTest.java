package br.com.orientacaoobjetos.heranca.test;

import br.com.orientacaoobjetos.heranca.model.Endereco;
import br.com.orientacaoobjetos.heranca.model.Pessoa;
import br.com.orientacaoobjetos.heranca.model.Funcionario;

public class HerancaTest {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        endereco.setCep("12000-454");
        endereco.setRua("Rua Rui Barbosa");
        
        Pessoa pessoa = new Pessoa("Mateus");
        pessoa.setCpf("47898817523");
        pessoa.setNome("Mateus");
        pessoa.setEndereco(endereco);
        
        Funcionario funcionario =  new Funcionario("Mateus");
        funcionario.setCpf("48512365478");
        funcionario.setNome("Carlos");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(123445.90);
        
        pessoa.imprime();
        
        funcionario.imprime();
        
    }
}
