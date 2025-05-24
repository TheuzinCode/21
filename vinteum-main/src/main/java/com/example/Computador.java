package com.example;

public class Computador extends Jogador {
    
    boolean parou() {
        return this.getPontos() >= 16;
    }
}
