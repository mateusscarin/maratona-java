package br.com.orientacaoobjetos.introducaometodos.model;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDadosFunc() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + "  ");
        }
        this.mediaSalFunc();
    }

    public void mediaSalFunc() {
        if (salarios == null) {
            return;
        }
        double media = 0.0;
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.println("\n" + media);
    }
}
