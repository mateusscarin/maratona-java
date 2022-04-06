package br.com.orientacaoobjetos.associacao.test;

import br.com.orientacaoobjetos.associacao.model.Escola;
import br.com.orientacaoobjetos.associacao.model.Professor;

public class EscolaTest {

    public static void main(String[] args) {

        Professor professor1 = new Professor("Silvio");
        Professor professor2 = new Professor("Jorge");

        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Fatec", professores);

        escola.imprime();
    }
}
