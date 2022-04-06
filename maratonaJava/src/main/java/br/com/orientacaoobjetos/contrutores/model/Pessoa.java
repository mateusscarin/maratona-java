package br.com.orientacaoobjetos.contrutores.model;

public class Pessoa {

    private String nome;
    private int idade;
    private String tipo;
    private String sexo;
    private String funcao;

    public Pessoa(String nome, int idade, String tipo, String sexo) {
        this();
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, String tipo, String sexo, String funcao) {
        this(nome, idade, tipo, sexo);
        this.funcao = funcao;

    }

    public Pessoa() {

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.tipo);
        System.out.println(this.sexo);
        System.out.println(this.funcao);
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
