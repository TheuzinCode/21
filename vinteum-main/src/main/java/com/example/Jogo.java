package com.example;

public class Jogo extends Monte{
    Monte monte = new Monte();
    Jogador jogador = new Jogador();
    Computador computador = new Computador();

    Jogo() {
        monte.embaralhar(); 
    }

    Carta distribuirCartaParaJogador(Jogador jogador) { 
        Carta primeiraCarta = monte.virar();

        if (jogador.parou()) {
            return null;
        }

        jogador.receberCarta(primeiraCarta);
        return primeiraCarta;

    }

    boolean acabou() {
        if (jogador.parou() || jogador.pontos >= 21) {
            if (jogador.pontos >= 21) {
                return true;
            }
        }

        return false;
    }

    String resultado() {
        if(acabou()) {
            return "Você ganhô com " + jogador.pontos + "pontos";
        }

        return "Perdeu fi";
    }

    Computador getComputador() {
        return computador;
    }

    Jogador getJogador() {
        return jogador;
    }
}
