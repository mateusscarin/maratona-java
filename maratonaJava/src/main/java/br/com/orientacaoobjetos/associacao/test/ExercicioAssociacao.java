package br.com.orientacaoobjetos.associacao.test;

import br.com.orientacaoobjetos.associacao.model.Aluno;
import br.com.orientacaoobjetos.associacao.model.Local;
import br.com.orientacaoobjetos.associacao.model.Professor;
import br.com.orientacaoobjetos.associacao.model.Seminario;

public class ExercicioAssociacao {

    public static void main(String[] args) {
        
        Local local = new Local("Rua das Margaridas");
        Aluno aluno = new Aluno("Mateus", 18);
        Aluno aluno2 = new Aluno("Gustavo", 19);
        Aluno aluno3 = new Aluno("Gabriel", 20);
        Professor professor = new Professor("Silvio", "Algoritmo");
        
        Aluno[] alunos = {aluno, aluno2, aluno3};
        Seminario seminario = new Seminario("Exercicio Associacao", alunos, local);
        Seminario seminario2 = new Seminario("Exercicio Lógica", alunos, local);
        
        Seminario[] seminarios = {seminario, seminario2};
        
        professor.setSeminarios(seminarios);
        
        professor.imprime();
        
    }
}
