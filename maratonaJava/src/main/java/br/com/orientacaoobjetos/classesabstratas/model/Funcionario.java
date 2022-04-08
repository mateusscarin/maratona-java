package br.com.orientacaoobjetos.classesabstratas.model;

public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }

    @Override
    public void imprime() {
        System.out.println("Método imprime");
    }

}
