package br.com.orientacaoobjetos.heranca.model;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    
    static{
        System.out.println("Dentro do bloco estático da superclasse");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático da superclasse");
    }
    public void imprime(){
        System.out.println("------------------");
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(endereco.getRua()+" "+endereco.getCep());
    }

    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Dentro do contrutor da superclasse");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
