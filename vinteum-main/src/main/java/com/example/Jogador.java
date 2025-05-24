package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;
    

    public void receberCarta(Carta carta) {
        cartas.add(carta);
        pontos += carta.numero;
    }

    public void parar() {
        this.parou = true;
    }
    public boolean Parou() {
        return parou;
    }



    

    public int getPontos() {
        return this.pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public List<Carta> getCartas() {
        return this.cartas;
    }   
    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setParou(boolean parou) {
        this.parou = parou;
    }

}
