package com.example;

public class Jogo extends Monte{
  Monte monte = new Monte();
     Jogador jogador = new Jogador();
     Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador) {
        if (!jogador.Parou()) {
            Carta carta = monte.virar();
            jogador.receberCarta(carta);
            return carta;
        }
        return null;


       }


    public boolean acabou(){
        if(jogador.getPontos() > 21 || jogador.Parou()){
            return true;
        }
        if(computador.getPontos() > 21 || computador.Parou()){
            return true;
        }

    return false;
    }

    public String resultado(){
        return "Resultado: " + jogador.getPontos() + " - " + computador.getPontos();   
    }
}
