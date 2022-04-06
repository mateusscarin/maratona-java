package br.com.orientacaoobjetos.sobrecargametodos.model;

public class Pessoa {

    private String nome;
    private int idade;
    private String tipo;
    private String sexo;

    public Pessoa() {
        
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.tipo);
        System.out.println(this.sexo);
    }

    public void init(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void init(String nome, int idade, String tipo, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
