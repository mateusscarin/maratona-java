package br.com.orientacaoobjetos.introducaometodos.test;

import br.com.orientacaoobjetos.introducaometodos.model.Funcionario;

public class FuncionarioTestExercicio {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.idade = 17;
        funcionario.nome = "Mateus";
        funcionario.salarios = new double[]{1000, 1000, 1000, 1000, 1000};

        funcionario.imprimirDadosFunc();
    }
}
