package br.com.orientacaoobjetos.introducaometodos.test;

import br.com.orientacaoobjetos.introducaometodos.model.Estudante;

public class EstudanteTest2 {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.idade = 16;
        estudante1.nome = "Jorge";
        estudante1.sexo = 'M';

        estudante2.idade = 18;
        estudante2.nome = "Maria";
        estudante2.sexo = 'F';
        
        estudante1.imprime();
        estudante2.imprime();
    }
}
