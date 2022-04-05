package br.com.orientacaoobjetos.introducaoclasses.test;

import br.com.orientacaoobjetos.introducaoclasses.model.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.idade = 18;
        estudante.nome = "Mateus";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
