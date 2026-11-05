package org.example;

import java.util.Random;

public class Hledamcislo {
    private int hledanecislo;
    private int pocetPokusu;

    public Hledamcislo(){
        Random random= new Random();
        hledanecislo = random.nextInt(100) + 1;
        pocetPokusu=0;
    }
    public boolean naslo(int cislo) {
        pocetPokusu++;
        return cislo == hledanecislo;

    }
    public boolean jeVetsi(int cislo){
        if (cislo > hledanecislo)
            return false;
    }



    public int getPocetPokusu() {
        return pocetPokusu;
    }
}

