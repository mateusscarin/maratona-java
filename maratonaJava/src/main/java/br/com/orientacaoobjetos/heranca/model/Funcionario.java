package br.com.orientacaoobjetos.heranca.model;

public class Funcionario extends Pessoa {

    private double salario;
    static{
        System.out.println("Dentro do bloco estático da subclasse");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático da subclasse 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático da subclasse 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do contrutor da subclasse");
    }
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
