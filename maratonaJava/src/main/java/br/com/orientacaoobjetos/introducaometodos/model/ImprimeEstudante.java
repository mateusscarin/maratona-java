package br.com.orientacaoobjetos.introducaometodos.model;

public class ImprimeEstudante {
    
    public void imprimeEstudante(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);        
    }  
}
