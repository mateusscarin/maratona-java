package br.com.orientacaoobjetos.introducaoclasses.test;

import br.com.orientacaoobjetos.introducaoclasses.model.Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.idade = 18;
        professor.nome = "Mateus Scarin";
        professor.sexo = 'M';
        System.out.println(professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
