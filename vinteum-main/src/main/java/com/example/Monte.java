package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte extends Carta {
    private List<Carta> cartas = new ArrayList<>();
    

    public Monte(){
        for (Naipe naipe : Naipe.values()) {
            for (int i = 1; i <= 13; i++) {
                this.cartas.add(new Carta(i, naipe));
            }
        }
    }

    public void embaralhar() {
       Collections.shuffle(this.cartas);
    }

    public Carta virar(){
        if (this.cartas.isEmpty()) {
            return null;
        }
        return this.cartas.remove(0);
    }

}
