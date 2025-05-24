package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    int pontos = 0;
    static List<Carta> nomeDaLista = new ArrayList<>();
    boolean parou = false;

    void receberCarta(Carta carta) {
        nomeDaLista.add(carta); 
        pontos += carta.numero;
    }

    void parar() {
        this.parou = true;
    }

    List<Carta> getCartas() {
        return nomeDaLista;
    }

    int getPontos() {
        return pontos;
    }

    boolean parou() {
        return this.parou;
    }
}
