package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte extends Carta {
    List<Carta> cartas = new ArrayList<>();

    Monte() {
        for (Naipe naipe : Naipe.values()) {
            for (numero = 1; numero <= 13; numero++) {
                cartas.add(new Carta(numero, naipe));
                System.out.println("numero=" + numero + "naipe=" + naipe);
            }
        }
    }

    void embaralhar() {
        Collections.shuffle(cartas);
    }

    Carta virar() {
        return cartas.remove(0);
    }

}
