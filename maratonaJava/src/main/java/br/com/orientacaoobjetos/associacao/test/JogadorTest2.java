package br.com.orientacaoobjetos.associacao.test;

import br.com.orientacaoobjetos.associacao.model.Jogador;
import br.com.orientacaoobjetos.associacao.model.Time;

public class JogadorTest2 {
    
    public static void main(String[] args) {
       
    Jogador jogador1 = new Jogador("Pelé");
    Time time = new Time("Seleção Brasileira");
    
    jogador1.setTime(time);
    jogador1.imprime();
    
    }
}
