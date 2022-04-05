package br.com.orientacaoobjetos.introducaometodos.model;

public class Pessoa {

    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
     public int getIdade(){
        return this.idade;
    }
}
