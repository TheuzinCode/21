package com.example;

public class Carta {
    int numero;
    Naipe naipe;

    Carta() {

    }

    Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    String imagePath() {
        if (numero == 1) {
            return "classic-cards/" + "Ace" + this.naipe + ".png";
        } else if (numero == 11) {
            return "classic-cards/" + "Jack" + this.naipe + ".png";
        } else if (numero == 12) {
            return "classic-cards/" + "Queen" + this.naipe + ".png";
        } else if (numero == 13) {
            return "classic-cards/" + "kING" + this.naipe + ".png";
        }

        return "classic-cards/" + numero + this.naipe + ".png";
    }

    int getNumero() {
        return this.numero;
    }

    Naipe getNaipe() {
        return this.naipe;
    }

}
