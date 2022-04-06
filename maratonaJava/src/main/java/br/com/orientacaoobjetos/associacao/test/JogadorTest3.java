package br.com.orientacaoobjetos.associacao.test;

import br.com.orientacaoobjetos.associacao.model.Jogador;
import br.com.orientacaoobjetos.associacao.model.Time;

public class JogadorTest3 {

    public static void main(String[] args) {
        
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Mateus");
        Time time =  new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        
        jogador1.setTime(time);
        jogador2.setTime(time);
        
        time.setJogadores(jogadores);
        
        System.out.println("----Jogador----");
        jogador1.imprime();
        
        System.out.println("----Time----");
        time.imprime();
        
       
        
        
    }
}
